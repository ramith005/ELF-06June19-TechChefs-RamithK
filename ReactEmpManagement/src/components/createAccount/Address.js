import React, { Component } from 'react'

export class Address extends Component {
    render() {
        return (
            <div className="row">
                <div className="col-md-8 offset-2 card form1">
                    <div className="card-body">
                        <h4 className="text-center border-bottom">EMPLOYEE ADDRESS
                INFORMATION</h4>
                        <br />
                        <div className="row">
                            <div className="col-md-6">
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Address Type</label> <select className="form-control" name="addressInfoBeans[0].addressPKBean.addressType" required>
                                            <option value disabled selected>-- select one --</option>
                                            <option>Temporary</option>
                                            <option>Permanent</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Address1</label> <input className="form-control" type="text" name="addressInfoBeans[0].address1" placeholder="Enter Address Line 1" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Address2</label> <input className="form-control" type="text" name="addressInfoBeans[0].address2" placeholder="Enter Address Line 2" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Landmark</label> <input className="form-control" type="text" name="addressInfoBeans[0].landmark" placeholder="Enter Address Landmark" />
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-6">
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>City</label> <input className="form-control" type="text" name="addressInfoBeans[0].city" placeholder="Please Enter City" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>State</label> <input className="form-control" type="text" name="addressInfoBeans[0].state" placeholder="Please Enter State" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Country</label> <input className="form-control" type="text" name="addressInfoBeans[0].country" placeholder="Please Enter Country" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Pincode</label> <input className="form-control" type="number" name="addressInfoBeans[0].pin" placeholder="Please Enter Pincode" />
                                    </div>
                                </div>
                                <br />
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default Address
