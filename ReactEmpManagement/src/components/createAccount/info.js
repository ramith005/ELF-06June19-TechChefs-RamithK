import React, { Component } from 'react'

 class Info extends Component {
    render() {
        return (
            <div className="row ">
        <div className="col-md-8 offset-2 card form1">
          <div className="card-body">
            <h4 className="text-center border-bottom">EMPLOYEE INFORMATION</h4>
            <br />
            <div className="row">
              <div className="col-md-6">
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>ID</label> <input className="form-control" type="number" required name="id" id="id1" placeholder="Please Enter ID" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Name</label> <input className="form-control" type="text" name="name" placeholder="Please Enter Name" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Password</label> <input className="form-control" type="password" name="password" id="password" placeholder="Please Enter Password" onkeyup="validate()" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Confirm Password</label> <input className="form-control" type="password" id="cfpassword" placeholder="Please Confirm Password" onkeyup="validate()" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Age</label> <input className="form-control" type="number" name="age" placeholder="Please Enter Age" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Gender</label> <select className="form-control" name="gender">
                      <option>-- select one --</option>
                      <option value="male">Male</option>
                      <option value="female">Female</option>
                    </select>
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Salary</label> <input className="form-control" type="text" name="salary" placeholder="Please Enter Salary" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Phone Number</label> <input className="form-control" type="number" name="phone" placeholder="Please Enter Phone Number" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Joining Date</label> <input className="form-control" type="date" name="joiningDate" placeholder="Please Enter Joining Date" />
                  </div>
                </div>
              </div>
              <div className="col-md-6">
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Account Number</label> <input className="form-control" type="number" name="accountNumber" placeholder="Please Enter Account Number" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Email Id</label> <input className="form-control" type="email" name="email" placeholder="Please Enter Email ID" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Designation</label> <input className="form-control" type="text" name="designation" placeholder="Please Enter Designation" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>DOB</label> <input className="form-control" type="date" name="dob" placeholder="Please Enter DOB" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Department ID</label> <input className="form-control" type="number" name="departmentId" placeholder="Please Enter Department ID" />
                  </div>
                </div>
                <div className="row">
                  <div className="col-md-12 form-group">
                    <label>Manager ID</label> <input className="form-control" type="number" name="managerId" placeholder="Please Enter Manager ID" />
                  </div>
                </div>
                <br />
              </div>
            </div>
          </div>
        </div>
      </div>
        );
    }
}

export default Info
