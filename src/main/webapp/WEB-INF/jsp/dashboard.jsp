<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>

<!-- CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
	
<!-- Bootstrap JavaScript and jQuery -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
.container {
	margin-top: 50px;
}

.heading {
	font-size: 24px;
	font-weight: bold;
	margin-bottom: 20px;
}

.btn-primary {
	background-color: #007bff;
	border-color: #007bff;
}

.btn-danger {
	background-color: #dc3545;
	border-color: #dc3545;
}
</style>
</head>
<body>
<!-- 	<script type="text/javascript">
	function validOldPass(){
		var oldPass ="${loggedInUser.password}";
		var userEnterOldpassword = document.getElementById("oldPassword").value;
		if(oldPass == userEnterOldpassword ){
			alert("your Password has been updated:)");
			return true;
		}
		else{
			alert("please check your old password is Incorrect ):");
			return false;
		}
	}
	</script>-->
	<div class="container">
    <h3 class="heading">Welcome to the Dashboard</h3>
    <h2>Hi, ${userName}</h2>

    <div class="row mt-4">
        <div class="col-md-6">
            <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#updateModal">Edit Profile</button>
        </div>
        <div class="col-md-6">
            <form action="/deleteUser/${loggedInUser.userId}" method="POST">
                <input type="hidden" name="_method" value="DELETE">
                <button type="submit" class="btn btn-danger btn-lg">Delete User</button>
            </form>
        </div>
        <div class="col-md-6">
            <form action="/logout" method="POST" class="mt-4">
                <button type="submit" class="btn btn-primary">Logout</button>
            </form>
        </div>
    </div>
</div>

<!-- Update User Modal -->
<div class="modal fade" id="updateModal" tabindex="-1" role="dialog" aria-labelledby="updateModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="updateModalLabel">Update User Details</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form id="updateForm" method="POST" action="updateUser" onsubmit="return validOldPass()">
                    <div class="form-group">
                        <label for="userName">Username (Readonly)</label>
                        <input type="text" class="form-control" id="userName" name="userName" value="${loggedInUser.userName}" required readonly>
                    </div>
                    <div class="form-group">
                        <label for="oldPassword">Old Password</label>
                        <input type="password" class="form-control" id="oldPassword" name="oldPassword" required>
                    </div>
                    <div class="form-group">
                        <label for="newPassword">New Password</label>
                        <input type="password" class="form-control" id="newPassword" name="newPassword" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
