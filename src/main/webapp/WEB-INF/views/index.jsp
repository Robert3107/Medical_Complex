<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8"/>
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Medical Complex</title>
    <link rel="stylesheet" href="<c:url value="../../resources/js/css/style.css"/>"/>
</head>
<body>
<div class="sidebar close">
    <div class="logo-details">
        <i class='bx bx-diamond'></i>
        <span class="logo_name">Medical Complex</span>
    </div>
    <ul class="nav-links">
        <li>
            <a href="#">
                <i class='bx bxs-user-account'></i>
                <span class="link_name">Sign Up</span>
            </a>
            <ul class="sub-menu blank">
                <li><a class="link_name" href="#">Sign Up</a></li>
            </ul>
        </li>
        <li>
            <a href="#">
                <i class='bx bx-log-in'></i>
                <span class="link_name">Sign In</span>
            </a>
            <ul class="sub-menu blank">
                <li><a class="link_name" href="#">Sign In</a></li>
            </ul>
        </li>
        <li>
            <div class="profile-details">
                <div class="name-job">
                    <a href="https://github.com/Robert3107/Medical_Complex">
                        <i class='bx bxl-github'></i>
                    </a>
                    <a href="https://www.linkedin.com/in/robert-jachowicz-846548214/">
                        <i class='bx bxl-linkedin-square'></i>
                    </a>
                </div>
            </div>
        </li>
    </ul>
</div>
<section class="home-section">
    <div class="home-content">
        <i class='bx bx-menu'></i>
    </div>
    <div class="background">
        <img src="<c:url value="../../resources/images/background.jpg"/>" alt="Medical Complex" width="100%" height="100%"/>
    </div>
</section>
<script src="<c:url value="../../resources/js/app.js"/> "></script>
</body>
</html>
