<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>医生信息查询</title></head>
<body>
<table border="1">
    <h1>Hello this is</h1>
    <tr>
        <th>医生id</th>
        <th>医生工号</th>
        <th>医生姓名</th>
        <th>医生年龄</th>
        <th>医生性别</th>
        <th>所属科室</th>
        <th>职务</th>
    </tr>

    <tr>
        <td>${doctor.doctorId}</td>
        <td>${doctor.doctorNum}</td>
        <td>${doctor.doctorName}</td>
        <td>${doctor.doctorAge}</td>
        <td>${doctor.doctorSex}</td>
        <td>${doctor.department}</td>
        <td>${doctor.position}</td>
    </tr>
</table>
</body>
</html>

