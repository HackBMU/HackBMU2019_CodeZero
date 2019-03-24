import { Component, OnInit } from '@angular/core';
import { stringify } from '@angular/compiler/src/util';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  constructor() {  }
  formFields:FormGroup;
 
 Driver:boolean=false;
  Hospital : boolean=false;
  selectUsertype(){
    
  }
  ngOnInit() {
    this.formFields = new FormGroup({
      Username :new FormControl(),
      Email :new FormControl(),
      Password :new FormControl(),
      ConfirmPassword :new FormControl(),
      PhoneNumber :new FormControl(),
      Address :new FormControl()
     
    
  });
  }
}
