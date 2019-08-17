import React, { Component } from 'react'

export class OtherInfo extends Component {
    render() {
        return (
            <div className="row">
                <div className="col-md-8 offset-2 card form1">
                    <div className="card-body">
                        <h4 className="text-center border-bottom">EMPLOYEE OTHER
                INFORMATION</h4>
                        <br />
                        <div className="row">
                            <div className="col-md-4">
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>PAN Number</label> <input className="form-control" name="otherInfo.pan" type="text" placeholder="Please Enter PAN Number" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Marital Status</label> <select name="otherInfo.isMarried" className="form-control">
                                            <option>Select</option>
                                            <option value="true">Yes</option>
                                            <option value="false">No</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Blood Group</label> <select name="otherInfo.bloodGrp" className="form-control">
                                            <option value="b+">B+ve</option>
                                            <option value="b-">B-ve</option>
                                            <option value="ab+">AB+ve</option>
                                            <option value="ab-">AB-ve</option>
                                            <option value="o+">O+ve</option>
                                            <option value="o-">O-ve</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Physically Challenged</label> <select name="otherInfo.isChallenged" className="form-control">
                                            <option value="true">Yes</option>
                                            <option value="false">No</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4">
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Emergency Contact Number</label> <input name="otherInfo.emergencyCN" className="form-control" type="number" placeholder="Please Enter Emergency Contact Number" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Emergency Contact Name</label> <input name="otherInfo.emergencyCP" className="form-control" type="text" placeholder="Please Enter Emergency Contact Name" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Nationality</label> <select name="otherInfo.nationality" className="form-control">
                                            <option>--select one--</option>
                                            <option value="india">India</option>
                                            <option value="japan">Japan</option>
                                            <option value="china">China</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Religion</label> <select name="otherInfo.religion" className="form-control">
                                            <option>--select one--</option>
                                            <option value="hindu">Hindu</option>
                                            <option value="sikh">Sikh</option>
                                            <option value="christian">Christian</option>
                                            <option value="muslim">Muslim</option>
                                        </select>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Father Name</label> <input name="otherInfo.fatherNM" className="form-control" type="text" placeholder="Please Enter Father Name" />
                                    </div>
                                </div>
                            </div>
                            <div className="col-md-4">
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Mother Name</label> <input name="otherInfo.motherNM" className="form-control" type="text" placeholder="Please Enter Mother Name" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Spouse Name</label> <input name="otherInfo.spouseNM" className="form-control" type="text" placeholder="Please Enter Spouse Name" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Passport Number</label> <input name="otherInfo.passport" className="form-control" type="text" placeholder="Please Enter Passport Number" />
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-12 form-group">
                                        <label>Aadhar Number</label> <input name="otherInfo.adhar" className="form-control" type="text" placeholder="Please Enter Aadhar Number" />
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

export default OtherInfo
