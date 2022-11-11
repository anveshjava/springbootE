<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input form </title>

<style>

table,  td {
  border: 3px solid;
}
th {
  border: 6px solid;
}
tr {
  border-collapse: collapse;
  width: 100%;
}

th {
  height: 100%;
   background-color: #04AA6D;
  color: lightblue; 
}
.p1 {
  font-family: "Times New Roman", Times, serif;
}

.p2 {
  font-family: Arial, Helvetica, sans-serif;
}

.p3 {
  font-family: "Lucida Console", "Courier New", monospace;
}
</style>
</head>
<body>
<form action= "saveCustomer">
<table>
<tr>
<th><p class="p1"> CUSTOMER ID NUMBER </p></th>
<th><p class="p2"> CUSTOMER NAME</p></th>
<th><p class="p1">ADDRESS</p></th>

</tr>
<tr>
<td><p class="p3"><input name="c_id" /></p></td>
<td><p class="p1"><input name="c_name"/></p></td>
<td><p class="p2"><input name="c_address"/></p></td>

</tr>
<tr><td colspan="4" align="center"><font color= "blue"><h3> Available points </h3> </font></td>
<td colspan="4" align="center"><font color= "blue"><input name="c_points"/></font></td></tr>
<tr><td colspan= "4" align= "center"><font color ="blue"><h3>click submit to save data</h3><input type="submit"/></font></td></tr>

</table>
</form>
</body>
</html>