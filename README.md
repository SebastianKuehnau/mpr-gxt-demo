# Company Dashboard GXT sample migrated to Vaadin

This project show how to integrate an existing GXT Application in Vaadin 23. Therefore every view in GXT is wrapped 
into a generic view wrapper for Vaadin 8 and afterwards wrapped with the a MPR Component to integrate it in a 
Vaadin 23 Application. With this setup the application could be upgrade view-by-view to Vaadin 23.

The initial project has been implemented by johannesh2 and published here https://github.
com/johannesh2/company-dashboard-migration-apache2

To start the application run `mvn package jetty:run` and navigate to http://localhost:8080

To run the application you need a GXT license.