// Place your Spring DSL code here
beans = {
	mailSender(org.springframework.mail.javamail.JavaMailSenderImpl) {
		host = 'smtp.gmail.com'
		port = 465
		username = 'skrzynka.robocza.paau@gmail.com'
		password = '1234567890qwertyuiop'
		javaMailProperties = ['mail.smtp.auth': 'true',
				'mail.smtp.socketFactory.port': '465',
				'mail.smtp.socketFactory.class': 'javax.net.ssl.SSLSocketFactory',
				'mail.smtp.socketFactory.fallback': 'false']
	}
	// You can set default email bean properties here, eg: from/to/subject
	mailMessage(org.springframework.mail.SimpleMailMessage) { 
		from = 'myapp@maurice.co.uk' 
	}
}
