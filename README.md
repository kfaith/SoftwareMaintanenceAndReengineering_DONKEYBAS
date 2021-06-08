# SoftwareMaintanenceAndReengineering_DONKEYBAS
This repository holds the game that I reengineered (DONKEYBAS) during the semester.

If the program does not compile initially due to undetected JavaFX Library:

The user may not have JavaFx Installed, please follow these instructions if you feel this includes you.

First, install JavaFx from https://gluonhq.com/products/javafx/. Once JavaFx is installed, you must create it as a library. To do this, go to “File” -> “Project Structure” -> “Libraries” -> “+”. Then select the lib folder where you downloaded your JavaFx files. This creates the library and allows you to run the application.  If the program still doesn’t run, go to “run” -> “edit configurations”. Then click “modify options”, and create a VM Option, and input:

   “--module-path FILEPATHTO/lib --add-modules javafx.controls”
Or 
   “--module-path FILEPATHTO/lib --add-modules javafx.controls,javafx.fxml,javafx.base,javafx.graphics,javafx.media,javafx.swing,javafx.web”
   
   After this, the code should run without a hitch.
