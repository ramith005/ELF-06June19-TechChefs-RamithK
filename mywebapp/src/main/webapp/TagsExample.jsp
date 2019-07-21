<%!
	public String name = "Rajani Kanth";
	private int age = 100;
	
	{
		System.out.println("Inside my Block");
	}
	public String getName () {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public String  getName (String name) {
		return "Given Name is : "+name;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags Example</title>
</head>
<body>
	<h1>Name 1: <%=name %></h1>
	<h1>Name 2: <%=getName() %></h1>
	<h1>Name 3: <%=getName("Praveen") %></h1>
	<h1>Age 1 : <%=age %></h1>
	<h1>Age 2 : <%=getAge() %></h1>
</body>
</html>