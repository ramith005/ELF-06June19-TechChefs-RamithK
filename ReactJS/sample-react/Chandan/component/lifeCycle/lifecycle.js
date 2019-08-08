class LifeCycle extends React.Component {
    constructor(props){
        super(props);
        console.log("constructor LifeCycle");
        this.state = {
            name : 'Sundari',
            checked: true
        }
    }
    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps LifeCycle');
        return null;
    }
    render(){
        console.log('Render LifeCycle');
        if(this.state.checked){
            return (
               /* <div>
                <h1>{this.state.name}</h1>
                <button onClick={this.changeName.bind(this)}>Change Name</button>
                </div>*/
                <Child />
            )
        }
        return <h1>Checked is False</h1>
    }
    componentDidMount(){
        console.log("componentDidMount LifeCycle");
    }
    shouldComponentUpdate(){
        console.log("shouldComponentUpdate LifeCycle");
        return true;
    }
    getSnapshotBeforeUpdate(){
        console.log("getSnapShotBeforeUpdate LifeCycle");
        return "SnapsshotData"; //If something returned here that will be passed as the third parameter to componentDidUpdate()
    }
    componentDidUpdate(props,state,snapshot){
        console.log("componentDidUpdate LifeCycle");
        console.log('Props',props);
        console.log('State',state);
        console.log('SnapShot',snapshot);
    }
    componentWillUnmount(){
        console.log("componentWillUnmount LifeCycle");
    }
    changeName() {
        this.setState({
            name : 'Dinga Dinga'
        })
    }
}

class Child extends React.Component {
    constructor(props){
        super(props);
        console.log("constructor LifeCycle Child");
        this.state = {
            name : 'Sundari',
            checked: false
        }
    }
    static getDerivedStateFromProps() {
        console.log('getDerivedStateFromProps LifeCycle Child');
        return null;
    }
    render(){
        console.log('Render LifeCycle Child');
        if(this.state.checked){
            return (
                <h1>Child Component</h1>
            )
        }
        return <h1>Checked is False</h1>
    }
    componentDidMount(){
        console.log("componentDidMount LifeCycle Child");
    }
    shouldComponentUpdate(){
        console.log("shouldComponentUpdate LifeCycle Child");
        return true;
    }
    getSnapshotBeforeUpdate(){
        console.log("getSnapShotBeforeUpdate LifeCycle Child");
        return "SnapsshotData"; //If something returned here that will be passed as the third parameter to componentDidUpdate()
    }
    componentDidUpdate(props,state,snapshot){
        console.log("componentDidUpdate LifeCycle Child");
        console.log('Props',props);
        console.log('State',state);
        console.log('SnapShot',snapshot);
    }
    componentWillUnmount(){
        console.log("componentWillUnmount LifeCycle Child");
    }
    changeName() {
        this.setState({
            name : 'Dinga Dinga'
        })
    }
}

ReactDOM.render(<div><LifeCycle /><Child /></div>,document.getElementById("app"));