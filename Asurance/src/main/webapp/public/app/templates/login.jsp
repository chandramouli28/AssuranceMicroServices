<% String failure = (String) session.getAttribute("nopassword"); %>
<div class="container" >

	<div class="row" id="loginForm">
		<div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3" >
			<form role="form" action="getCustomer" method="post">
				<fieldset>
					<h2 style="color:red">Welcome!</h2>
					<hr class="colorgraph">
					<div class="form-group">
						<input type="email" name="email" id="Email" class="form-control input-lg" placeholder="Email">
					</div>
					<div class="form-group">
						<input type="password" name="password" id="Password" class="form-control input-lg" placeholder="Password">
					</div>
					<span class="button-checkbox">
						<button type="button" class="btn" data-color="info">Remember Me</button>
						<input type="checkbox" name="rememberMe" id="remember_me" checked="checked" class="hidden">
						<a href="" class="btn btn-link pull-right">Forgot Password?</a>
					</span>
					<%if(failure != null) {%><div id="wrongCredential" style="color:red"><%=failure %></div>
					<%} session.invalidate();%>
					
					<hr class="colorgraph">
					<div class="row">
						<div class="col-xs-6 col-sm-6 col-md-6">
							<input type="submit" class="btn btn-lg btn-success btn-block" value="Submit">
						</div>
						<div class="col-xs-6 col-sm-6 col-md-6">
							<a  href="#" class="btn btn-lg btn-primary btn-block" ui-sref="register">Register</a>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>


