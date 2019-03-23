using System;
using System.Security.Claims;
using System.Threading.Tasks;
using Microsoft.AspNet.Identity;
using AspNet.Identity.MongoDB;
using Microsoft.AspNet.Identity.EntityFramework;
using Microsoft.AspNet.Identity.Owin;
using MongoDB.Driver;
using API.Properties;
using System.Configuration;

namespace API.Models
{
    // You can add profile data for the user by adding more properties to your ApplicationUser class, please visit https://go.microsoft.com/fwlink/?LinkID=317594 to learn more.
    public class ApplicationUser : AspNet.Identity.MongoDB.IdentityUser
    {
        public async Task<ClaimsIdentity> GenerateUserIdentityAsync(UserManager<ApplicationUser> manager, string authenticationType)
        {
            // Note the authenticationType must match the one defined in CookieAuthenticationOptions.AuthenticationType
            var userIdentity = await manager.CreateIdentityAsync(this, authenticationType);
            // Add custom user claims here
            return userIdentity;
        }

        internal Task<ClaimsIdentity> GenerateUserIdentityAsync(ApplicationUserManager userManager)
        {
            throw new NotImplementedException();
        }
    }


    public class ApplicationDbContext : IDisposable
    {
        private IMongoDatabase Database;
        public ApplicationDbContext()

        {

            var client = new MongoClient(Settings.Default.ConString);
            Database = client.GetDatabase(Settings.Default.DB);
        }

        public static ApplicationDbContext Create()
        {
            return new ApplicationDbContext();
        }

        public IMongoCollection<ApplicationUser> ApplicationUsers => Database.GetCollection<ApplicationUser>("ApplicationUsers");
        public IMongoCollection<UserRegisterBindingModel> NormalUser => Database.GetCollection<UserRegisterBindingModel>("NormalUser");
        public IMongoCollection<DriverRegisterBindingModel> Driver => Database.GetCollection<DriverRegisterBindingModel>("Driver");
        public IMongoCollection<HospitalRegisterBindingModel> Hospital => Database.GetCollection<HospitalRegisterBindingModel>("Hospital");
        public void Dispose()
        {

        }
    }
}