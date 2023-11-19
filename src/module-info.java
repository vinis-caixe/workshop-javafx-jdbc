module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	opens gui to javafx.fxml;
	
	exports model.entities;
	opens model.entities to javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
