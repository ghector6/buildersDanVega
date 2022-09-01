import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
List courses = [
		[id:1, name: 'Apache Groovy'],
		[id:2, name:'JavaScript']

]


builder.html{
	head{
		title 'Aboout Hector Garcia'
		description 'This is part of my Diaspora journal '
		keywords 'Hector, Groovy, Java, Spring'
	}
	body {
		h1 'About Me'
		p 'This is bunch of text about the Groovy journy'
		section{
			h2 'Courses'
			table{
				tr{
					th 'id'
					th 'name'
				}
				courses.each{ course ->
					tr{
						td course.id
						td course.name
					}

				}
			}
		}
	}

}