import React from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

import ViewAccounts from './ViewAccounts';
import CreateAccount from './CreateAccount';

export default function Navbar(props) {
    return(
        <Router>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <h1 class="navbar-brand" href="#">Employee</h1>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <Link class="nav-link" to="/">CreateAccount<span class="sr-only">(current)</span></Link>
                </li>
                <li class="nav-item">
                    <Link class="nav-link" to="/viewaccounts">View Account</Link>
                </li>
                </ul>
            </div>
            </nav>
            <Route exact path='/' component={CreateAccount}></Route>
            <Route exact path='/viewaccounts' component={ViewAccounts}></Route>
        </Router>
    );
    
}
