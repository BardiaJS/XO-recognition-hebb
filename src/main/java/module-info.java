module com.example.final_hebb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.final_hebb to javafx.fxml;
    exports com.example.final_hebb;
}