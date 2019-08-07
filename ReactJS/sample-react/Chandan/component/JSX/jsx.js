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
const name = "Akshay";
const element = <h1>{name}</h1>;

function Welcome(props){
    return(<h1>{props.name}</h1>);
}

class Message extends React.Component {
    constructor(props){
        super(props)
    }
}
//as properties you can pass only dtring or javascript objects
ReactDOM.render(<Welcome name="cool"/>,document.getElementById("app"));