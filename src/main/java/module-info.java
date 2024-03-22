module com.example.travail_a_faire_j2e_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.context;
    requires spring.beans;

    exports dao;
    exports Metier;

    opens com.example.travail_a_faire_j2e_1 to javafx.fxml;
    exports com.example.travail_a_faire_j2e_1;
}