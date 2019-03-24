import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { RegisterComponent } from './components/register/register.component';
import { IndexComponent } from './index/index.component';

const routes: Routes = [
  {path:"login",component:LoginComponent},
  {path:"navbar",component:NavbarComponent},
  {path:"register",component:RegisterComponent},
  {path :"index", component: IndexComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
