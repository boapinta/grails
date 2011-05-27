package hello.mail

/**
* Hit http://localhost:8080/hello-mail/email?to=boapinta@interia.pl&subject=hello+world&body=This+is+a+test
*/
class EmailController {

	def emailService
	// Send an email
	def index = {
		// Each "email" is a simple Map
		def email = [
			to: [ params.to ],        // "to" expects a List, NOT a single email address
			subject: params.subject,
			text: params.body         // "text" is the email body
		]
		// sendEmails expects a List
		emailService.sendEmails([email])
		render("done")
	}
}
