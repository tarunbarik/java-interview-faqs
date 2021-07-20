<script>
	var lastActiveTimeMs = new Date().getTime(); //This is set to current time on page load
	var SESSION_TIMEOUT_MILLIS = 1 * 60 * 1000; //1 mins in milliseconds
	var CHECK_TIME_MILLIS = 60 * 1000; //1 mins in milliseconds

	setTimeout(fnCheckTimeout, CHECK_TIME_MILLIS); //Check the timeout once in a minute
	function fnCheckTimeout() {
		var curMs = new Date().getTime();
		if ((curMs - lastActiveTimeMs) > SESSION_TIMEOUT_MILLIS) {
			window.location.href = 'login.jsp';
		}
	}

	//Keep updating lastActiveTime every time you do an Ajax call. 
	//Because server will keep extending the session for every page load or ajax call from client
</script>