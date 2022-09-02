import groovy.xml.MarkupBuilder 

//FileWriter writer1 = new FileWriter('html1/checkIfWorking.html')
MarkupBuilder builder1 = new MarkupBuilder()

List data = [
[isbn:978-1935182443, title:"Groovy in Action 2nd Edition", author:"Dierk Koenig", price:50.58],
[isbn:978-1935182948, title:"Making Java Groovy", author:"Ken Kousen", price:33.96],
[isbn:978-1937785307, title:"Programming Groovy 2: Dynamic Productivity for the Java Developer", author:"Venkat Subramaniam", price:28.92]

]

builder1.html{
	head{

		title 'Exercises on HTML builders'
		description 'This is an exercise on HTML builders and structure '
		keywords 'Hector, Groovy, Java, HMTL'
	}
	body{
		h1 'HTML exercise'
		p 'This is to practice structures and builders'
		section{
			h2 'List of Groovy Books and Authors'
			table{
				tr{
					th ('ISBN')
					th ('TITLE')
					th ('AUTHOR')
					th ('PRICE')
				}
				data.each{ dat ->
					tr{
						td dat.isbn
						td dat.title
						td dat.author
						td dat.price
					}

				}
			}
		}
	}
}

