//Program 1
//const element = <h1>This is JSX</h1>
//ReactDOM.render(element,document.getElementById('app'));

//Program 2
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(){
    return(<h1>Akshay</h1>);
}


ReactDOM.render(<Welcome />,document.getElementById("app"));*/

//Program 3
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(<h1>{props.name}</h1>);
}


ReactDOM.render(<Welcome name="cool"/>,document.getElementById("app"));*/
//Program 4
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <h1 style={{color:'red'}}>{props.name}</h1>
    );
}

class Message extends React.Component {
    constructor(props){
        super(props)
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Welcome name="Akshay" />,document.getElementById("app"));*/

//Program 5
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <div>   
        <h1 style={{color:'red'}}>{props.name}</h1>
        <button onClick={()=>alert('Button clicked')}>Click Me</button>
    </div> 
    );
}

class Message extends React.Component {
    constructor(props){
        super(props)
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Welcome name="Akshay" />,document.getElementById("app"));*/

//Program 6
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <div>   
        <h1 style={{color:'red'}}>{props.name}</h1>
        <button onClick={alert.bind(this,'Button clicked')}>Click Me</button>
    </div> 
    );
}

class Message extends React.Component {
    constructor(props){
        super(props)
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Welcome name="Akshay" />,document.getElementById("app"));*/

//Program 7
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <div>   
        <h1 style={{color:'red'}}>{props.name}</h1>
        <button onClick={alert.bind(this,'Button clicked')}>Click Me</button>
    </div> 
    );
}

class Message extends React.Component {
    constructor(props){
        super(props)
        this.state = {
            name : 'Akshay'
        }
    }

    render() {
        return (
            <div>
                <h1>{this.state.name}</h1>
            </div>
        )
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Message  />,document.getElementById("app"));*/

//Program 8
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <div>   
        <h1 style={{color:'red'}}>{props.name}</h1>
        <button onClick={alert.bind(this,'Button clicked')}>Click Me</button>
    </div> 
    );
}

class Message extends React.Component {
    constructor(props){
        console.log("Constructor");
        super(props)
        this.state = {
            name : 'Akshay'
        }
        this.changeMessage = this.changeMessage.bind(this);
    }

    render() {
        console.log("Rendering");
        return (
            <div>
                <h1>{this.state.name}</h1>
                <button onClick={this.changeMessage}>Change Message</button>
            </div>
        )
    }

    changeMessage(){
        console.log("changeMessage function called");
        this.setState({name:'Alia Bhat'})
        //Set state method will again call the render method
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Message  />,document.getElementById("app"));*/

//Program 9
/*const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(
    <div>   
        <h1 style={{color:'red'}}>{props.name}</h1>
        <button onClick={alert.bind(this,'Button clicked')}>Click Me</button>
    </div> 
    );
}

class Message extends React.Component {
    constructor(props){
        console.log("Constructor");
        super(props)
        this.state = {
            name : 'Akshay'
        }
        this.changeMessage = this.changeMessage.bind(this);
        this.clickLink = this.clickLink.bind(this);
    }

    render() {
        console.log("Rendering");
        return (
            <div>
                <h1>{this.state.name}</h1>
                <h2>Render</h2>
                <button onClick={this.changeMessage}>Change Message</button><br />
                <a href="https://www.google.com" onClick={this.clickLink}>Link</a>
            </div>
        )
    }

    changeMessage(){
        console.log("changeMessage function called");
        this.setState({name:'Alia Bhat'})
        //Set state method will again call the render method
    }

    clickLink(event) {
        event.preventDefault(); //Prevent the default behaviour like redirection to a different page in case of anchor tag
        alert("on click fun called ..!");
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Message  />,document.getElementById("app"));*/

/*
Props 
a) Immutable
b) can be used in functions or class
c) pass prop from parent to child
d) Not required for this keyword

State
a) Muttable
b) only in class components
c) Only within the component
d) use the this key keyword
*/

/* 
Requirements for React Project
a) React
b) React DOM
c) Babel (For the JSX)
d) Webpack ( Convers all the different js files to a single file)
*/