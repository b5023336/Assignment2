package librarysystem

class BootStrap {

    def init = { servletContext ->

	def LBlag=new
		Student(
		name:	'Lewis Blagdon'	
		email:	'LBlag@gmail.com'			
		username: 'Blagdon97483'		
		password: 'The Doors'	
		studentID: 'b523094'		
		course:	''
		).save

	def DDash=new
		Student(
		name:	'Lewis Blagdon'	
		email:	'LBlag@gmail.com'			
		username: 'Blagdon97483'		
		password: 'The Doors'	
		studentID: 'b523094'		
		course:	''
		).save





	[object].addto[object](name of class)





    }
    def destroy = {
    }
}
