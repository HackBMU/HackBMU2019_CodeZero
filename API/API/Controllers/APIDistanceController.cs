using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Web;
using System.Web.Http;
using System.Web.Mvc;

namespace API.Controllers
{
    public class APIDistanceController : ApiController
    {
        // GET: APIDistance
        public async Task<IHttpActionResult> Name() {

             object distanceTime(string wayPoint1, string wayPoint2,string time)
            {
                var Api = "http://dev.virtualearth.net/REST/v1/Routes?wayPoint.1=" + wayPoint1 + "&waypoint.2=" + wayPoint2 + "2&optimize=timeWithTraffic&timeType=Arrival&dateTime=" + time +
                "&distanceUnit=km&key=ArA1Ia_YMBny3C67AvN0bx4K3ZnJ7wB4Fr4LF1H8jPxqHbnx1RRFsfeUoHMN9Wcq";
                var obj = Api.ToString();
                return (obj);
            }
           var tr = distanceTime("Gurgaon", "Delhi", "22:31:00");

            return Json(tr);
        }
    }
}