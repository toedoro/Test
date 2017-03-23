# Setting up

* install node js

* install bower globally

* install git (required for bower packages)

* installs all dependencies declared in package.json 
	run `npm install`

* installs all dependencies declared in bower.json 
	run `bower install`
		
# Development
	
### Grunt:

* install grunt-cli globally
	run `npm install grunt-cli -g`

* install SASS for stylesheets
	install ruby
	run `gem install sass`

* runs grunt tasks described in Gruntfile.coffee which watches coffeescript and sass files for changes and compiles them into corresponding .js and .css files
	run `grunt`

### Package Managers:

* Bower
	- manage your frontend dependencies. Libraries like jQuery, AngularJS, underscore, etc

* NPM (Node Package Manager)
	- install modules used in a node.js environment, or development tools built using node.js such as Karma, lint, minifiers and so on

### Installing necessary packages through bower:

* check for package name in bower repository 'http://bower.io/search/'

* append '--save-dev' if package if a development dependency 
	`bower install <package-name> --save-dev`

* append '--save' if package is for production and assumed required for dev as well
	`bower install <package-name> --save`

* all saved packages are written in bower.json

### Installing dependencies through npm (Node Package Manager):

* check for package name in npm repository 'https://www.npmjs.com/browse/keyword/repository'

* append '--save-dev' if package if a development dependency 
	`npm install <package-name> --save-dev`

* append '--save' if package is for production and assumed required for dev as well
	`npm install <package-name> --save`

* all saved dependencies are written in package.json

# Running the Application

* runs script defined in 'scripts:start' in package.json
	`npm start`

* defaults to port '8080'

* change port by adding -p <port-number> (e.g. "http-server -c-1 -p 9000")