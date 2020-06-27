<meta>
---------------
	- The <meta> tag provides metadata about the html documents.
	- metatdata will not be displayed on the webpage, but it will be machine persable.
	- meta elements are used to specify page description, keywords, author of the document, last modified etc...

	- E.g,

		automatically page refreshment after 5 seconds

<link/>
------------------
	- It is used to navigation functionality.
	- It defines a link between a document and an external resource.
	- It is used to link to external style sheet

<title>
---------------
	- A <title> tag is an html element that specifies the title of the web page.
	- It is required in all html document.
	- It defines a title in the browser toolbar.

<style>
----------------
	- It is used for written style information
	
<script>
-----------------
	- It is used to define a client-side script in javaScript
	Example:-
		to display the current date and time

	href -- Hypertext reference
	----------------------------------
		- It is an attribute of the anchor tag , which is also used to identify sections within a document.
	rel 
	----------
		- rel is short for relation.
		- It specifies the relation between the tag and href


<input/> OR <input></input>
===================================
	- By defaut input tag provides a text-field.
	- each tag has some attributes.
	- Example:-
			<html>
			<head>
				<!--<meta http-equiv="refresh" content="5,url=http://www.facebook.in"/> -->
				<link rel="icon" href="d.jpg"/> 
				<title>LIT - Training | Java | Adv Java | HTML | Oracle </title>
				<style type = "text/css">
					body
					{
						background-color: #ffff00; 
						
						background-color: aqua;
						background-color: rgb(255 , 255 , 255); 
					}
				</style>
				<script type="text/javascript">
					document.write("<h1>"+Date()+"</h1")
				</script>
			</head>
			<body>

				<input/>
				<br/> <br/>
				<input placeholder="search" />
				<br/> <br/>
				<input disabled="disabled"/>
				<br/> <br/>
				<input type="text" value="Chasma" disabled="" />
				<br/> <br/>
				<input type="text" size="10" />
				<br/> <br/>
				<input type="text" value="Simple" maxlength="10" />
				<br/> <br/>
				<input type="number" max="35" min="24"/>
				<input type="number" />
				<br/> <br/>
				<input type="password" />
				<br/> <br/>
				
			</body>
			</html>

Difference between check-box and radio button
---------------------------------------------------
	- Check-box is used to select multi selection functionality , whereas radio button used to single selection functionality.
	- Check-box can be checked and unchecked , whereas radio button can only be checked.
	- If we want to uncheck the radio button then we must the give the same value in name attribute.


			Choose Ur Course :-
		<br/>
		<input type="checkbox">java</input>
		<input type="checkbox">adv java</input>
		<input type="checkbox">Oracle</input>
		<input type="checkbox">Python</input>
		<input type="checkbox">Hadoop</input>
		<br/><br/>
		Select Gender :
		<input type="radio" name="Chasma">Male</input>
		<input type="radio" name="Chasma">FeMale</input>
		<input type="radio" name="Chasma">Other</input>


	<form>
	===============
		- It is a container which contains input elements

		- form is used to send name and value to the process, when user click the submit button by using get() or post() method.

		- By default the method is get()

		<input type="submit"/>
		==============================
			- It is used to prepare a submit button.
			- It gives request to the form for sending name and value to the process.

		Example
		-----------------------

			<form method="post" action="manage.html"> <!-- will hide the uname=Bajepila&pwd=Chasma in url if we use the method  , action will do manage.html in the url-->
			Enter user name : <input type="text" name="uname"/>
			<br/>
			Enter password : <input type="password" name="pwd"/>
			<br/>
			<input type="submit" value="ClickMe" />  <!-- will create uname=Bajepila&pwd=Chasma in url-->
			<input type="button" value="Click"/>
			</form>

	<TABLE>
	=================
	<caption> : It is used to set the title of the table
	<table> : It is used to prepare the table
	<tr> : It is used to define a row of table
	<td> : It is used to define a cell, by default the text is normal and left alligned.
	<th> : it is also used to define a cell, by default the text is bold and center alligned.

	cellspacing : It is distance between 2 cell borders
	cellpadding : distance between the cell border and text.

	rowspan : merging the cell row-wise
	colspan : merging the cell column-wise
	

	<html>
	<head></head>
	<body>
		<table border="1" cellspacing="0"
			cellpadding="5" width="100%" >
			<caption>Student</caption>
			<tr>
				<th>Name</th>
				<th>Roll</th>
			</tr>
			<tr>
				<td>Chasma</td>
				<td>101</td>
			</tr>
			<tr>
				<td>Raja</td>
				<td>102</td>
			</tr>
			<tr>
				<td>Rani</td>
				<td>103</td>
			</tr>
		</table>
	</body>
	</html>




<html>
<head></head>
<body>
	<table border="1" cellspacing="0"
		cellpadding="5" width="100%" >
		<caption>Mark</caption>
		<tr>
			<th rowspan="2">Math</th>
			<th>Paper-1</th>
			<th>Paper2</th>
		</tr>
		<tr>
			<td>71</td>
			<td>72</td>
		</tr>
		<tr>
			<th>English</th>
			<td colspan="2">68</td>
		</tr>
	</table>
</body>
</html>





<html>
<head></head>
<body>
	<table border="1" cellspacing="0"
		cellpadding="5" width="100%" >
		<caption>Chasma_Table</caption>
		<tr>
			<td colspan="3">1</td>
		</tr>
		<tr>
			<td colspan="3">2</td>
		</tr>
		<tr>
			<td colspan="3">3</td>
		</tr>
		<tr>
			<td>4</td>
			<td rowspan="3">5</td>
			<td>6</td>
		</tr>		
		<tr>
			<td>7</td>
			<td>8</td>
		</tr>
		<tr>
			<td>9</td>
			<td>10</td>
		</tr>
		<tr>
			<td colspan="3">11</td>
		</tr>
		<tr>
			<td colspan="3">12</td>
		</tr>
		

	</table>
</body>
</html>






<html>
<head></head>
<body>
	<table border="1" cellspacing="0"
		cellpadding="5" width="100%" >
		<caption>LIT_TABLE</caption>
		<tr>
			<td rowspan="2">1</td>
			<td>2</td>
			<td>3</td>
		</tr>
		<tr>
			<td>4</td>
			<td>5</td>
		</tr>
		<tr>
			<td>6</td>
			<td rowspan="2">7</td>
			<td rowspan="2">8</td>
		</tr>
		<tr>
			<td>9</td>
		</tr>
		<tr>
			<td rowspan="2">10</td>
			<td colspan="2">11</td>
		</tr>
		<tr>
			<td colspan="2">12</td>
		</tr>
		<tr>
			<td colspan="3">13</td>
		</tr>
</table>
</body>
</html>





<a> : It is used to Provide navigation functionality

	<html>
	<head></head>
	<body>
		Hello Chasma
		<h1>Hello Chasma</h1>
		<h2>Hello Bajepila</h2>
		<h3>Hello Chasma</h3>
		<h4>Hello Bhala Pila</h4>
		<h5>Hello Chasma</h5>
		<h6>Hello Chasma</h6>
		<h7>Hello</h7>
	</body>
	</html>




<html>
<head></head>
<body>
	<address>
		<h3>Devi prasad</h3>
		<h3>Jagamohan Nagar</h3>
		<h3>Block-13</h3>
		<h3>Jagamara</h3>
		<h3>Panchasakha nagar</h3>
		<h3>Pincode-751030</h3>
	</address>
</body>
</html>




<html>
<head></head>
<body>
	<fieldset>
		<legend>Address</legend>
		<h1>Deviprasad Mishra</h1>
		<h1>Lit</h1>
		<h1>Acharya Vihar</h1>
		<h1>bhubaneswar</h1>
		<h1>Mob No - 484981614894</h1>
	</fieldset>
</body>
</html>




<html>
<head></head>
<body>
	<a href="Address.html">My Address</a>
	<br/>
	<a href="Contact.html">Contact Me</a>
</body>
</html>





<html>
<head></head>
<body>
	<iframe src="d.jpg" height="300" width="1000" name="Chasma"></iframe>
	<br/>
	<a href="Address.html" target="Chasma">My Address</a>
	<br/>
	<a href="Contact.html" target="Chasma">Contact Me</a>
	<br/>
	<a href="IMG1.jpg" target="Chasma">HELLO</a>
	<br/>
	<a href="IMG2.jpg" target="Chasma">HIHI</a>
	<br/>
	<a href="IMG3.jpg" target="Chasma">HARI</a>
	<br/>
	<a href="Hey.rar">download</a>
</body>
</html>





<html>
<head>
	<style type="text/css">
		div
		{
			height: 100px;
			width: 100%;
			background-color: #ff0000;
			color: #ffffff;
			padding-top: 10px;
		}
	</style>
</head>
<body>
	<div>
		<h1>All Adv Java Students are well..</h1>
	</div>
</body>
</html>





<html>
<head>
	<style type="text/css">
		div
		{
			height: 100px;
			width: 100%;
			background-color: #ff0000;
			color: #ffffff;
			padding-top: 10px;
		}
	</style>
</head>
<body>
	<div>
		<marquee scrollamount="20"
		direction = "right"
		onmouseover="this.stop()"
		onmouseout ="this.start()"
		>
		<h1>All Adv Java Students are well..</h1>
		</marquee>
	</div>
		<marquee scrollamount="30" behavior="alternate">
			<img src="d.jpg" height="500px" width="800px">
		</marquee>
	
</body>
</html>





<html>
<head></head>
<body>
	<select>
		<option hidden="hidden">Choose..</option>
		<optgroup label="boys">
			<option>Raja</option>
			<option>Chasma</option>
			<option>Chandan</option>
		</optgroup>
		<optgroup label="Girls">
			<option>Rani</option>
			<option>Chasmis</option>
			<option>Aishwarya</option>
		</optgroup>
	</select>
</body>
</html>









<html>
<head></head>
<body>
		<!--<select size="4">
		<option hidden="hidden">Choose..</option>
			<option>Raja</option>
			<option>Chasma</option>
			<option>Chandan</option>
			<option>Rani</option>
			<option>Chasmis</option>
			<option>Aishwarya</option>
			<option>Devi</option>
	</select>-->

	<!--<bdo dir="rtl">Chasma</bdo>
	<br/>
	<b>litIndia</b>
	<br/>
	<strong>litIndia</strong>
	<br/>
	<h1>The first smart city of Odisha is <mark>BBSR</mark></h1>
	<br/>
	<center>Chasma</center>
	<br/>
	<p>Hello This Is Devi</p>
	<div>Hi</div> -->

	<!--<del>29000</del>10000
	<br/>
	<strike>Cbfhsma</strike>Chasma -->

	<!--<u>Chasma is Simple</u>
	<br/>
	<i>All are well Except Chasma</i>
	<hr/>
	<hr size="300" width="0" />
	<br/>-->

	<!--<dl> ---Document List
	<dt> --- Document type
	<dd> --- Document description-->
		<!--<dl>
			<dt>Java</dt>
			<dd>Java is a programming languageJava is a programming languageJava is a programming languageJava is a programming languageJava is a programming languageJava is a programming languageJava is a programming language</dd>
			<dt>Oracle</dt>
			<dd>Oracle uses databaseOracle uses databaseOracle uses database</dd>
			<dt>Html</dt>
			<dd>Html is Client Side Marker Language</dd>
		</dl>-->

	<!--<ol> -- order list
	<ul> -- un-order list
	<li> -- list -->

	<!--<ol type="1 or a or i">
		<li>Java</li>
		<li>Adv Java</li>
		<li>Oracle</li>
		<li>Python</li>
		<li>html</li>
	</ol> -->
	<br/>
	<br/>
	<!--<ul type="circle or square">
		<li>Java</li>
		<li>Adv Java</li>
		<li>Oracle</li>
		<li>Python</li>
		<li>html</li>
	</ul> -->

	<!--<p>
		Chasma
					is
							Simple
	</p>

	<pre>
		Chasma
					is
							Simple
	</pre> -->

	<!--1<sup>st</sup> 2<sub>nd</sub> 3<sup>rd</sup>-->

	<!--Example to create a auto-combo-box-->

	<!--<input list="Chasma"/>
	<datalist id="Chasma">
		<option value="Raja"></option>
		<option value="Rani"></option>
		<option value="Rakesh"></option>
	</datalist> -->

	
</body>
</html>






<details>
====================
	- This tag specifies additional details that the user can view or hide on demand.

	- It can be used to create an interactive widget that the user can open and close

	- we can put any type of content inside the <details> tag.

		Example
		------------------
			<html>
			<head></head>
			<body>
				<details>
					<summary>-A.P.J. Abdul Kalam</summary>
					<h3>Success is when your "signature"" changes to "Autograph"</h3>
					<h3>All birds find shelter during the rain But the eagle avoids rain by flying above the clouds. Problems are common, but attitude makes the difference.</h3>
					<h3>One of the very important characteristics of a student is to ask question.</h3>
				</details>

			</body>
			</html>




style sheet with css
==================================
	- css stands for cascading style sheet
	- Job of css : It describes how html elements are to be display on the screen or webpage.
					It saves a lot of works

					At once, it can control the layout of multiple webpages
	- style sheets are useful, because we can use the same style sheet for many documents.

	- style sheets are also called as templates.

	- There are 3 different ways to write style information

		1. inline
		2. embeded or internal
		3. external

	1. inline
	------------------
		- Here the style information written inside the tag by using style attribute.
		- In other words it is used to apply a unique style to a single html element.

		Example-1
		---------------------
			<html>
			<head></head>
			<body>
				<p style="background-color: yellow">Chasma is simple</p>
				<p style="background-color: yellow">Hello Chasma</p>
				<p style="background-color: yellow">Hi Chasma</p>
				
				<h1 style="background-color: yellow; color: red">Except Chasma all are well</h1>
				<h1 style="background-color: yellow">Hello Dear</h1>
				<h1 style="background-color: yellow">Hi Dear</h1>
				<h1 style="background-color: yellow">Bye Dear</h1>

			</body>
			</html>


	2. embeded or internal
	-----------------------------
		- It is used only for a single html page to define the style
		- Here the style information is written by enclosing <style> tag in the <head> part of the html document.
		- Here style information apply over all elements by using 3 different ways.
			a. by tag name
			b. by id attribute (#)
			c. by class attribute (.)

		Example-2
		----------------------
			<html>
			<head>
				<style type="text/css">
					h3,p
					{
						background-color: #ffff00;
						color: #ff0000;
					}
					#K
					{
						background-color: #00ff00;
						color: blue;
						font-family: verdana;
						padding: 10px;
						width: 40%;
						margin-left: 200px;
					}
					.Demo
					{
						color: #888888;
					}
				</style>
			</head>
			<body>
				<h3>Two wrongs don't make a right</h3>
				<h3>The pen is mighter than a sword</h3>
				<h3 id="K">When the going gets tough, the tough gets going</h3>
				<p class="Demo">No man is an island</p>
				<p id="K">People who live in glass houses, should not throw stones</p>
				<p class="Demo">Hope for the best but be prepared for the worst</p>
			</body>
			</html>



	3. External
	-------------------
		- Here the style information written in a separate file and the file extension must be .css

		- Those web-page are linked to the external css file, they only use their information.

		Example-3
		----------------
			Created External,Photo,chandan .html files
			Created Style.css
			Used link tag





<!-- Example to set a background image-->
<html>
<head>
	<style type="text/css">
		body
		{
			background-image: url('d.jpg');
			background-repeat: no-repeat;
			background-size: 100%;
		}
	</style>
</head>
<body>

</body>
</html>











<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
	/*#demo
	{
		background-color: #dddddd;
		border: 2px solid #a1a1a1;
		padding: 10px  40px;
		width: 300px;
		border-radius: 25px;

	}*/
	/*.chasama
	{
		height: 300px;
		width: 300px;
		background-color: red;
		background-color: rgb(255,0,0);
		background-color: rgba(255,0,0,0.5);

	}*/
	/*.chasama:hover
	{
		background-color: yellow;
	}*/
	/*#t
	{
		height: 100px;
		width: 100px;
		background-color: #ff0000;
	}
	#t:hover
	{
		height: 400px;
		width: 400px;
		background-color: #00ff00;
		opacity: 0.3;
	}*/
	/*#red
	{
		height: 100px;
		width: 100%;
		background-color: red;
	}
	#green
	{
		background-color: green;
		height: 400px;
		width: 30%;
		float: left;
	}
	#blue
	{
		background-color: blue;
		height: 400px;
		width: 70%;
		float: right;
	}
	#black
	{
		background-color: black;
		height: 100px;
		width: 100%;
		margin-top: 400px;

	}*/
	/*div
	{
		background-color: red;
		height: 200px;
		width: 300px;
		transform: translate(500px,250px);
		/*transform: rotate(45deg);
		transform: skew(30deg,20deg);
	}*/
	/*#d1
	{
		height: 200px;
		width: 200px;
		background-image: -webkit-linear-gradient(top left,#ff0000 0%,#00ff00 100%);
	}
	#d2
	{
		height: 200px;
		width: 200px;
		background-image: -webkit-linear-gradient(bottom right,#ff0000 0%,#00ff00 100%);
		transform: translate(210px,-200px);
	}
	#d3
	{
		height: 200px;
		width: 200px;
		background-image: -webkit-linear-gradient(bottom left,#ff0000 0%,#00ff00 100%);
		transform: translate(420px,-400px);
	}
	#d4
	{
		height: 200px;
		width: 200px;
		background-image: -webkit-linear-gradient( top right,#ff0000 0%,#00ff00 100%);
		transform: translate(630px,-600px);
	}*/
	/*div
	{
		height: 100px;
		width: 300px;
		background-color: yellow;
		box-shadow: 10px 10px 5px #888888;
	}*/
	div
	{
		height: 300px;
		width: 300px;
		background-color: red;
		transform: translate(100px,100px);
		animation: chasama 5s infinite;
	}
	@keyframes chasama
	{
		0%{background-color: rgb(255,0,0);}
		10%{background-color: rgb(255,255,0);}
		25%{background-color: rgb(0,255,0);}
		50%{background-color: rgb(0,0,255);}
		80%{background-color: rgb(255,0,255);}
		100%{background-color: rgb(0,0,0);}
	}
	</style>
</head>
<body>
	<!-- <div id="demo">all the adv java students are well..</div> -->
	<!-- <div class="chasama"></div> -->
	<!-- <div id="t"></div> -->
	<!-- <div id="red"></div>
	<div id="green"></div>
	
	<div id="blue">
	<marquee>
		<img src="a.jpeg" height="200px" width="300px">
	</marquee>
	</div>
	<div id="black"></div> -->
	<!-- <div id="d1"></div>
	<div id="d2"></div>
	<div id="d3"></div>
	<div id="d4"></div> -->
	<!-- <div>
		Lit - Susant K rout's Center Of Excellence Contact-986432145
	</div>
 -->
 	<div></div>
</body>
</html>










<!-- Example of rounded corner -->
<html>
<head>
	<style type="text/css">
		#demo{
			background-color: #dddddd;
			border: 2px solid #a1a1a1;
			padding: 10px 40px;
			width: 300px;
			border-radius: 20px;
		}
	</style>
</head>
<body>
	<div id="demo">all the adv java students are well</div>
</body>
</html>








<!-- Example of colour animation -->
<html>
<head>
	<style type="text/css">
		div{
			height: 300px;
			width: 300px;
			background-color: rgb(255,0,0);
			transform: translate(100px, 150px);
			animation: chasma 15s infinite;
		}
		@keyframes chasma
		{
			0%{background-color: rgb(255,0,0);}
			10%{background-color: rgb(255,255,0);}
			25%{background-color: rgb(0,255,0);}
			50%{background-color: rgb(0,0,255);}
			80%{background-color: rgb(0,0,0);}
			100%{background-color: rgb(255,0,0);}
		}
	</style>
</head>
<body>
	<div></div>
</body>
</html>






Style.css
h1{
	color: rgb(255,0,0);
	background-color: aqua;
	font-family: vardana;
	padding: 30px;
	border: 10px solid grey;+
}





<html>
<head>
	<style type="text/css">
		body{
			background-image: url('IMG1.jpg');
			background-repeat: no repeat;
			background-size: 100%;
			background-attachment: fixed;
		}
	</style>
</head>
<body>
	Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.Chasma is simple.
</body>
</html>






<html>
<head>
	<style type="text/css">
		.chasma{
			height: 300px;
			width: 300px;
			/*background-color: red;*/
			/*background-color: #ff0000;*/
			/*background-color: rgb(255,0,0);*/
			background-color: rgba(255,0,0,0.5);  /*a stands for alpha otherwise knowh as transperency and range is from 0.1 to 1.0*/
		}
		.chasma:hover{
			background-color: yellow;
		}
	</style>
</head>
<body>
	<div class="chasma"></div>
</body>
</html>






<html>
<head>
	<style type="text/css">
		#t{
			height: 100px;
			width: 100px;
			background-color: #ff0000;
		}
		#t:hover{
			height: 500px;
			width: 500px;
			background-color: #00ff00;
			opacity: 0.3;
		}
	</style>
</head>
<body>
	<div id="t"></div>
</body>
</html>






<html>
<head>
	<style type="text/css">
		#a{
			height: 100px;
			width: 100%;
			background-color: #ff0000;
		}
		#b{
			height: 400px;
			width: 30%;
			background-color: #00ff00;
			float: left;
		}
		#c{
			height: 400px;
			width: 70%;
			background-color: #0000ff;
			float: right;
		}
		#d{
			height: 100px;
			width: 100%;
			background-color: #000000;
			margin-top: 400px;
		}
	</style>
</head>
<body>
	<div id="a">
		<marquee>
			<h1>Welcome to adv java...</h1>
		</marquee>
	</div>
	<div id="b"></div>
	<div id="c">
		<marquee direction="right" behavior="alternate" scrollamount="40">
		<img src="a.jpg"; height="200px" width="300px">
	</marquee>
	</div>
	<div id="d"></div>
</body>
</html>






<html>
<head>
	<style type="text/css">
		div{
			background-color: red;
			height: 200px;
			width: 300px;
			background-image: url('a.jpg');
			transform: translate(200px , 150px);
			transform: rotate(25deg);
			transform: skew(30deg,20deg);
		}
	</style>
</head>
<body>
	<div></div>
</body>
</html>







<!-- Example of linear gradient -->
<html>
<head>
	<style type="text/css">
		#d1{
			height: 200px;
			width: 200px;
			background-image: -webkit-linear-gradient(top left, #ff0000 0%, #00ff00 100%);
		}
		#d2{
			height: 200px;
			width: 200px;
			background-image: -webkit-linear-gradient(bottom right, #ff0000 0%, #00ff00 100%);
			transform: translate(210px, -200px);
		}
		#d3{
			height: 200px;
			width: 200px;
			background-image: -webkit-linear-gradient(bottom left, #ff0000 0%, #00ff00 100%);
			transform: translate(420px, -400px);
		}
		#d4{
			height: 200px;
			width: 200px;
			background-image: -webkit-linear-gradient(top left, #ff0000 0%, #00ff00 100%);
			transform: translate(630px, -600px);
		}
	</style>
</head>
<body>
	<div id="d1"></div>
	<div id="d2"></div>
	<div id="d3"></div>
	<div id="d4"></div>
</body>
</html>







<!-- Example of box-shadow -->
<html>
<head>
	<style type="text/css">
		div{
			height: 100px;
			width: 300px;
			background-color: #ffff00;
			box-shadow: 10px 10px 5px #888888;
		}
	</style>
</head>
<body>
	<div>
		Lit - Susant K Rout's Center Of Excellence.
		Contact - 9861098610
	</div>
</body>
</html>








	- When an animation is created in the @keyframe, we should be bind it to a selector.
	- Otherwise the animation will 


========================================================================================================================








JavaScript
===============================

	- Javascript is a client side scripting language that provides facility to perform any operation in client browser.

	- javascript is the most popular scripting language on the internet and works in all major browsers such as Internet Explorer(IE) , Mozilla Firefox, Google Chrome, Opera, Safari ..etc

	Q. What can JavaScript do
	-----------------------------
		- It can create cookie
		- It validates the data
		- detected the visitor browser
		...etc

	JavaScript declaration
	----------------------------------
		- JavaScript can be declared in 3 different ways

			1. document type
			2. embeded type / function
			3. external type

	1. document type
	-------------------------
		- Here the JavaScript information written inside the body part of the web-page by using script tag.

		Example:
			To display current date and time of the system.
				JavaScript_Ex1.html
<html>
<head>
	<title>	</title>
</head>
<body>
	<script type="text/javascript">
		document.write("<h1>"+Date()+"</h1>")
	</script>
</body>
</html>

	2. embeded type / function
	-------------------------------------
		- Here the JavaScript information written within the starting and ending tag of head part.

		Example:
			To display current date and time of the system.
				JavaScript_Ex2.html
<html>
<head>
	<script type="text/javascript">
		function display() 
		{
			document.getElementById("demo").innerHTML = Date();
		}
	</script>
</head>
<body onload="display()">
	<h1 id="demo"></h1>
</body>
</html>

	3. external type
	--------------------------
		- Here the JavaScript statement written within a separate file and the file extension should be .js
	Example : 
			When user click a button then call a JavaScript function that will display the date in divison tag.
				JavaScript_Ex3.html
				JavaScript_Ex3.js

<html>
<head>
	<script type="text/javascript" src="JavaScript_Ex3.js"></script>
</head>
<body>
	<button type="button" onclick="displayDate()">ClickMe</button>
	<div id="demo"></div>
</body>
</html>


function displayDate()
{
	document.getElementById("demo").innerHTML = Date();
}



	JavaScript Statement
	------------------------------------
		- JavaScript is a sequence of statement to be executed by the browser.

		- It is case sensitive

		- JavaScript Statement commands to the browser, the purpose of the command is to tell the browser what to do.

		Comments in JavaScript : 
		--------------------------------
			- There are 2 types of comments in JS.
				1. Single Line denoted by //
				2. Multiline denoted by /* 		*/

		JavaScript Variable
		----------------------------
			- var is the only unique way to declare any type of variable in JS.

			Example :
			----------------
				var i = 100;
				var name = "chasma";
				var ch = 'a';

				Example : to add between 2 numbers by using JS
				---------------------------------------------------
					firstpage.html
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function addNumber()
		{
			var i = parseInt(document.getElementById("fno").value);
			var j = parseInt(document.getElementById("sno").value);
			// document.write(i+j);
			var Result = i+j;
			document.getElementById("res").value = Result;
			document.getElementById("demo").innerHTML = "Addition is "+Result;
		}
	</script>
</head>
<body>
	
		Enter first number &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="fno"> <br>
		Enter second number <input type="text" id="sno"> <br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="add" onclick="addNumber()"></input><br>
		Result : <input type="text" id="res">
		<h1 id="demo"></h1>
</body>
</html>


Operators in JS
------------------------
Arithmetic Operator
---------------------------
	+ , - , * , / , % , ++ , --

Assignment Operator
--------------------------
	= , += , -= , *= , /= , %=

comparison operator
---------------------------
	== , === , != , > , < , <= , >=

logical operators
------------------
	&& , || , !

conditional operators (Ternary Operators)
--------------------------------------------------
	?:


=
----------
	- This operator will just check the euqality condition without Type Conversion

== : (equality or abstract comparison)
	It converts the operands to the same time before making the comparison.

=== : (strictly eequality)
	It compare the value which must have the same type and also match the content.
	i.e. It returns true if the operands are of the same type and the contents should be matched.

Example : 
		Write a JS program to enter any age , if the age is equal to or greater than 18 years then the message will display "You are eligible to vote" else "You are not eligible to vote" by using Ternary Operator

		eligible.html
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function checkEligible() 
		{
			var age = document.getElementById("age").value;
			var x = (age >= 18) ? "Eligible " : "Not Eligible";
			document.getElementById("k").innerHTML = x+ " to vote"
		}
	</script>
</head>
<body>
	Enter your age : <input type="text" id="age">
	<input type="button" value="check" onclick="checkEligible()">
	<h1 id="k"></h1>
</body>
</html>






== and === operator
-----------------------
<!DOCTYPE html>
<html>
<head>
	
</head>
<body>
	<script type="text/javascript">
		var a = 100;
		var b = "100";

		document.write(a==b);  //true
		document.write("<br>")
		document.write(a===b); //false
		
	</script>
</body>
</html>






&&(AND)
--------------
	- This operator returns true if both the expressions are true, otherwise it returns false.

OR(||)
---------------
	- This operator returns true if one or both the expressions are true, otherwise it returns false.

NOT(!)
---------------
	- This operator returns true for false statement and false for true statement

Examples
------------------
<!DOCTYPE html>
<html>
<head></head>
<body>
	<p id="demo"></p>
	<script type="text/javascript">
		var a = 10;
		var b = 20;

		document.getElementById("demo").innerHTML = (a<20 && b>10) + "<br>" + (a>20 && b>10) + "<br>" + (a<20 || b>10) + "<br>" + (a>20 && b<5); //true
	</script>
</body>
</html>






JS-POP-UP Menu
------------------------------
	- There are three different ways the pop-up box will be displayed by using JS.

	1. alert()
	2. confirm()
	3. prompt("some text" , "value")

Example : alert()
--------------------------
	<html>
	<head>
		<script type="text/javascript">
			function show() 
			{
				alert("chasma is simple");
			}
		</script>
	</head>
	<body onload="show()">

	</body>
	</html>




Example : Confirm()
-------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function display() 
		{
			var s = confirm("Do You Want To Delete ?");
			if(s == true)
			{
				document.write("Deleted")
			}
			else
			{
				document.write("HELLO ")
			}
		}
	</script>
</head>
<body>
	<input type="button" value="ClickMe" onclick="display()">
</body>
</html>


Example : prompt()
----------------------

<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function show()
		{
			var name = prompt("Please enter your name" , "chasma");
			document.write(name);
		}
	</script>
</head>
<body onload="show()">

</body>
</html>





Function in JS
-----------------------
	- Function are used to solve a particular task
	- Function also returns a value
	- Function can be declared by using function keyword with function_name associated wih a pair of curley braces.
	
	syntax
	----------------
		function function_name (var1,var2,....)
		{
			//code...
		}

Example
----------------
	<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function Product(a,b) 
		{
			return a*b;
		}
	</script>
</head>
<body>
	<script type="text/javascript">
		document.write(Product(5,4))
	</script>
</body>
</html>




Control Structure in JS
--------------------------------------
	- Control structure is used to control the JS statement by using

		- if..else
		- for loop
		- while loop ...etc

<!-- Check Even Or Odd -->
	<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function checkNumber() 
		{
			var x = document.getElementById("demo").value;
			if(x%2 == 0)
				document.write("Given number is even");
			else
				document.write("Given number is odd");
		}
	</script>
</head>
<body>
	<input type="text" id="demo"/>
	<input type="button" value="check" onclick="checkNumber()">
	
</body>
</html>






<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function createDiamond() 
		{
			var line = document.getElementById("line").value;
			var space = line/2;
			var star = 1;

			for (var i = 0; i < line; i++) 
			{
				document.write("<br>");
				for (var j = 0; j < space; j++) 
				{
					document.write("&nbsp;&nbsp;");
				}
				for (var j = 0; j < star; j++) 
				{
					document.write("*");
				}
				if (i<(line/2)-1) 
				{
					space = space - 1;
					star = star + 2;
				}
				else
				{
					space = space+1;
					star = star-2;
				}
			}
		}
	</script>
</head>
<body>
	Enter any Odd Number : <input type="text" id="line"/>
	<input type="button" value="ClickMe" onclick="createDiamond()" />
</body>
</html>






Find all odd numbers between a given range by using JS
--------------------------------------------------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function findOddNo(argument) 
		{
			var x = document.getElementById("oddrange1").value;
			var y = document.getElementById("oddrange2").value;
			
			document.write("Odd numbers are <br> ----------------<br>")
			for (var i = x; i < y; i++) 
			{
				if (i%2 != 0) 
				{
					document.write(i);
					document.write("<br>");
				}
			}			
		}
	</script>
</head>
<body>
	Enter ranges from low to high : <input type="text" id="oddrange1"/>
					<input type="text" id="oddrange2"/>
					<input type="button" value="ClickMe" onclick="findOddNo()">
</body>
</html>




	
Example to automatic background color change using JS
---------------------------------------------------------	
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		var arr = new Array("red", "green", "blue", "violet", "black");
		var i = 0;
		function changeColor() 
		{
			document.body.bgColor = arr[i];
			i++;
			if(i==arr.length)
			{
				i=0;

			}
			setTimeout("changeColor()" , "1000");	
		}
	</script>
</head>
<body onload="changeColor()">

</body>
</html>






Drop down list , choose color and it will show that color
------------------------------------------------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function changeColor() 
		{
			var s = document.getElementById("s1").value;
			document.getElementById("demo").bgColor = s;
		}
	</script>
</head>
<body id="demo">
	<select id="s1" onchange="changeColor()">
		<option>Select Background Color</option>
		<option value="red">red</option>
		<option value="blue">blue</option>
		<option value="green">green</option>
		<option value="black">black</option>
	</select>

</body>
</html>





Validate a mobile number
---------------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function validate() 
		{
			var v = document.getElementById("t1").value;
			if (isNaN(v)) 
			{
				alert("Enter only numbers");
				return false;
			}
			else if(v.length > 11 || v.length != 10)
			{
				alert("Enter correct phone number");
				return false;
			}
			else if(v.charAt("t1") != "9")
			{
				alert("phone number starts with 9, enter a correct number");
				return false;
			}
		}
	</script>
</head>
<body>
	<input type="text" id="t1">
	<input type="button" name="b1" value="Check" onclick="validate()">
</body>
</html>



onblur
----------------------
When you leave the input field , a function is triggered which transform the input text to upper case.
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function myFunction() 
		{
			var v = document.getElementById("fname");
			v.value = v.value.toUpperCase();
			v.value = v.value.toLowerCase();
			v.value = v.value.initCap();
		}
	</script>
</head>
<body>
	Enter Ur Name : <input type="text" id="fname" onblur="myFunction()" >
</body>
</html>




onreset Event
------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function message() 
		{
			alert("This box was triggered by onreset event....");

		}
	</script>
</head>
<body>
	<form onreset="message()">
		Enter ur name : <input type="text" size="20">
		<input type="reset">
	</form>
</body>
</html>




onkeypress event
-----------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function myFunction() 
		{
			alert("We pressed a key inside the input field");
		}
	</script>
</head>
<body>
	<input type="text" onkeypress="myFunction()">
</body>
</html>





onkeyup event
----------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function writeMessage() 
		{
			document.forms[0].mySecondInput.value = document.forms[0].myInput.value;
		}
	</script>
</head>
<body>
	<form>
		Enter ur name :
		<input type="text" name="myInput" onkeyup="writeMessage()" size="20">
		<input type="text" name="mySecondInput" size="30">
	</form>
</body>
</html>




onkeyup and onkeydown (both)
-------------------------------
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript">
		function color(color) 
		{
			document.forms[0].myInput.style.background = color;
		}
	</script>
</head>
<body>
	<form>
		<br/>
		<input type="text" onkeydown="color('yellow')" onkeyup="color('red')" name="myInput">
	</form>
</body>
</html>


=======================================================================================================================





JQuery
=====================================
	- JQuery is a library for developing ajax based application.
	- JQuery is a great library for javascript programmer.
	- It is used to simplify the developement of web-application.
	- It helps the programmer to keep the code simple and consize.
	- by using JQuery we can handle events, perform animation etc...

Steps to use JQuery
----------------------------
1. download the JQuery file and save it into the current project folder.
2. link the JQuery.js file to the web-page.
3. Create a file whose extension is .js then write JQuery syntax in .js file
4. link this file with your html file by using script tag.




<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="JQuery.js"></script>
	<script type="text/javascript" src="world.js"></script>
</head>
<body>
	<div id="head" style="background-color: #00ff00; width: 400px; height: 300px;"></div>
</body>
</html>

<!-- world.js created -->

$(document).ready(function()
{
	$("#head").click(function(){
		$("#head").hide("slow");
	})
})































