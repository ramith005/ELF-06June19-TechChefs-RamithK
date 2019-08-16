import React, { Component } from 'react'
import Info from './info';
import OtherInfo from './OtherInfo';
import Address from './Address';
import Education from './Education';
import Experience from './Experience';

export class createEmployee extends Component {
    render() {
        return (
      <div className="container">
      <div className="row">
        <div className="col-md-12 text-center">
          <h2 className="text-center">EMPLOYEE REGISTRATIONNN</h2>
        </div>
      </div>
      <form action="./createEmployee" method="post">
        <Info />
        <br />
        <br />
        <OtherInfo />
        <br />
        <br />
        <Address />
        <br />
        <br />
        <Address />
        <br />
        <br />
        <Education />
        <br />
        <br />
        <Education />
        <br />
        <br />
        <Experience />
        <br />
        <br />
        <Experience />
        <br />
        <br />
        <div className=" row text-center">
          <button type="button" className="offset-md-2 col-md-4 btn btn-outline-dark" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Reset</button>
          <button type="submit" className="col-md-4 btn btn-outline-info" style={{borderRadius: '0 3px 3px 0'}}>Submit</button>
        </div>
        <br />
        <br />
      </form>
    </div>
  );
    }
}

export default createEmployee
