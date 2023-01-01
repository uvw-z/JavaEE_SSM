<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>患者信息查询</title></head>
<body>
<table border="1">
    <h1>Hello this is</h1>
    <tr>
        <th>患者id</th>
        <th>患者编号</th>
        <th>患者姓名</th>
        <th>患者性别</th>
        <th>患者年龄</th>
        <th>主治医生Id</th>
        <th>主治医生：</th>
        <th>籍贯</th>
        <th>电话号码</th>
        <th>就诊记录</th>

    </tr>

    <tr>
        <td>${patient.patientId}</td>
        <td>${patient.patientNum}</td>
        <td>${patient.patientName}</td>
        <td>${patient.patientSex}</td>
        <td>${patient.patientAge}</td>
        <td>${patient.doctorId}</td>
        <td>${patient.doctorName}</td>
        <td>${patient.patientAdress}</td>
        <td>${patient.patientPhone}</td>
        <td>${patient.records}</td>

    </tr>
</table>
</body>
</html>


