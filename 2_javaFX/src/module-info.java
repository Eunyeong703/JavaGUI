module 2_javaFX {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
