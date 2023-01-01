<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>就诊记录查询</title></head>
<body>
<table border="1">
    <tr>
        <th>就诊id</th>
        <th>患者id</th>
        <th>患者姓名</th>
        <th>就诊日期</th>
        <th>病历</th>
    </tr>
    <tr>
        <td>${record.recordId}</td>
        <td>${record.patientId}</td>
        <td>${record.patientName}</td>
        <td>${record.recordDate}</td>
        <td>${record.condition}</td>
    </tr>
</table>
</body>
</html>

