package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField txt_b_3;

    @FXML
    private TextField txt_a_4;

    @FXML
    private TextField txt_b_2;

    @FXML
    private TextField txt_a_3;

    @FXML
    private TextField txt_b_1;

    @FXML
    private TextField txt_a_2;

    @FXML
    private TextField txt_a_1;

    @FXML
    private TextField txt_A;

    @FXML
    private TextField txt_B;

    @FXML
    private TextField txt_Zag_kilk_prac;

    @FXML
    private TextField txt_b_5;

    @FXML
    private TextField txt_b_4;

    @FXML
    private TextField txt_a_5;

    @FXML
    private TextField txt_Npkp;

    @FXML
    private TextField txt_square;

    @FXML
    private TextField txt_A_admin;

    @FXML
    private TextField txt_S_zagal;

    @FXML
    private TextField txt_Cn;

    @FXML
    private TextField txt_B_admin;

    @FXML
    private TextField txt_kilk;

    @FXML
    private TextField txt_Kilk_Evak_Vyh;

    @FXML
    private TextField txt_C0;

    @FXML
    private TextArea txtArea_VyhDani;

    double A = 0.0D;

    double B = 0.0D;

    double square = 0.0D;

    double a_1 = 0.0D;

    double a_2 = 0.0D;

    double a_3 = 0.0D;

    double a_4 = 0.0D;

    double a_5 = 0.0D;

    double Vt = 0.0D;

    double L = 0.0D;

    double Vl = 0.0D;

    double Nv = 0.0D;

    double Npkp = 0.0D;

    double C0 = 0.0D;

    double Cn = 0.0D;

    double Ai1;

    double Ai2;

    double i_s_p_z;

    double s_p_i;

    double s_p_g;

    double t_g_i;

    double Ni = 0.0D;

    double Ki = 0.0D;

    double Pi;

    double random_one() {
        return Math.random();
    }

    double random_two() {
        return Math.random();
    }

    double random_three() {
        return Math.random();
    }

    double random_four() {
        return Math.random();
    }

    double random_five() {
        return Math.random();
    }

    double random_six() {
        return Math.random();
    }

    double method_b_1() {
        return (int)Math.round((this.A * this.B + this.square) / 49.0D);
    }

    double method_b_2() {
        return Math.round((this.A * this.B + this.square) / 72.0D);
    }

    double method_b_3() {
        return Math.round(this.A * this.B / 900.0D + 0.1D);
    }

    double method_b_4() {
        return Math.round(this.A * this.B / 1600.0D);
    }

    double method_b_5() {
        return Math.round(2.0D * (this.A + this.B) / 1.5D * Math.sqrt(2.0D * (this.A + this.B)) + 0.5D);
    }

    double method_n_p_s_i() {
        return this.a_1 + random_one() * (method_b_1() - this.a_1);
    }

    double method_n_p_o_i() {
        return this.a_2 + random_two() * (method_b_2() - this.a_2);
    }

    double method_n_p_z_i() {
        return this.a_3 + random_three() * (method_b_3() - this.a_3);
    }

    double method_n_s_z_i() {
        return this.a_4 + random_four() * (method_b_4() - this.a_4);
    }

    double method_n_e_d_i() {
        return this.a_5 + random_five() * (method_b_5() - this.a_5);
    }

    double method_t_v_g_i() {
        return 60.0D * this.L / this.Vt + 8.0D + random_six() * (28.0D - 60.0D * this.L / this.Vt + 8.0D);
    }

    double method_s_p_i() {
        if (method_t_v_g_i() > 10.0D)
            return Math.PI * Math.pow(0.5D * this.Vl * method_t_v_g_i() + this.Vl * (method_t_v_g_i() - 10.0D), 2.0D);
        return Math.PI * Math.pow(0.5D * this.Vl * method_t_v_g_i(), 2.0D);
    }

    double method_s_p_g() {
        return 74.0D * this.Nv;
    }

    double method_t_g_i() {
        return method_s_p_i() / method_s_p_g() * 6.39D * Math.pow(method_s_p_g(), 0.893D) / 2.0D * this.Nv;
    }

    double method_i_s_p_z() {
        double i_s_p_z_2 = 1.0D - this.Npkp / 2.0D * (1.0D - method_n_p_s_i() / method_b_1()) * (1.0D - method_n_p_o_i() / method_b_2()) * (1.0D - method_n_p_z_i() / method_b_3()) * (1.0D - method_n_s_z_i() / method_b_4()) * (1.0D - method_n_e_d_i() / method_b_5());
        this.i_s_p_z = i_s_p_z_2 - 1.0D;
        return i_s_p_z_2;
    }

    void start_1() {
        method_i_s_p_z();
        if (this.i_s_p_z > 1.0005D) {
            while (this.i_s_p_z >= 1.0005D) {
                this.s_p_i = method_s_p_i();
                this.s_p_g = method_s_p_g();
                this.t_g_i = method_t_g_i();
                this.Ni++;
                method_i_s_p_z();
            }
            this.Ai1 = this.C0 * this.s_p_i + this.Cn * this.t_g_i;
        } else {
            this.s_p_i = method_s_p_i();
            this.s_p_g = method_s_p_g();
            this.t_g_i = method_t_g_i();
            this.Ai1 = this.C0 * this.s_p_i + this.Cn * this.t_g_i;
            this.Ni++;
        }
    }

    void start_2() {
        if (this.Ni <= 1.0D) {
            this.Ai2 = this.Ai1;
            start_1();
        }
    }

    void start_3() {
        if (this.Ai1 < this.Ai2) {
            this.Ai2 = this.Ai1;
        } else {
            this.Ki++;
            this.Pi = this.Ki / this.Ni;
        }
    }

    public void calk() {
        this.A = Double.parseDouble(this.txt_A.getText());
        this.B = Double.parseDouble(this.txt_B.getText());
        this.square = Double.parseDouble(this.txt_S_zagal.getText());
        this.a_1 = Double.parseDouble(this.txt_a_1.getText());
        this.a_2 = Double.parseDouble(this.txt_a_2.getText());
        this.a_3 = Double.parseDouble(this.txt_a_3.getText());
        this.a_4 = Double.parseDouble(this.txt_a_4.getText());
        this.a_5 = Double.parseDouble(this.txt_a_5.getText());
        this.Vt = 40.0D;
        this.L = 3.0D;
        this.Vl = 0.8D;
        this.Nv = 6.0D;
        this.Npkp = Double.parseDouble(this.txt_Npkp.getText());
        this.C0 = Double.parseDouble(this.txt_C0.getText());
        this.Cn = Double.parseDouble(this.txt_Cn.getText());
        this.txt_b_1.setText(String.valueOf((int)method_b_1()));
        this.txt_b_2.setText(String.valueOf((int)method_b_2()));
        this.txt_b_3.setText(String.valueOf((int)method_b_3()));
        this.txt_b_4.setText(String.valueOf((int)method_b_4()));
        this.txt_b_5.setText(String.valueOf((int)method_b_5()));

        calkResults();
    }

    public void calkResults(){
        start_1();
        start_2();
        start_3();
        this.txtArea_VyhDani.setText("Ймовірність відмови роботи протипожежної системи " + String.format("%.6f", new Object[] {Math.abs(Double.valueOf(this.i_s_p_z))  }) +
                "\n\n Кількість пожежних сповіщувачів " + (int)method_n_p_s_i() +
                "\n\nКількість пожежних оповіщувачів " + (int)method_n_p_o_i() +
                "\n\nКількість протидимних пристроїв " + (int)method_n_p_z_i() +
                "\n\nКількість евакуаційних виходів " + (int)method_n_e_d_i() +
                "\n\nПлоща пожежі, м.кв. " + String.format("%.0f", new Object[] { Double.valueOf(this.s_p_i) }) +
                "\n\nТривалість гасіння пожежі, хв " + String.format("%.0f", new Object[] { Double.valueOf(this.t_g_i) }) +
                "\n\nЗбитки внаслідок пожежі, грн " + String.format("%.0f", new Object[] { Double.valueOf(this.Ai2) }));
    }

    @FXML
    void calculate(ActionEvent event) {
        calk();
        //calkResults();
    }

    @FXML
    void clear(ActionEvent event) {
        this.txt_A.setText(null);
        this.txt_B.setText(null);
        this.txt_b_3.setText(null);
        this.txt_a_4.setText(null);
        this.txt_b_2.setText(null);
        this.txt_a_3.setText(null);
        this.txt_b_1.setText(null);
        this.txt_a_2.setText(null);
        this.txt_a_1.setText(null);
        this.txt_A.setText(null);
        this.txt_B.setText(null);
        this.txt_Zag_kilk_prac.setText(null);
        this.txt_b_5.setText(null);
        this.txt_b_4.setText(null);
        this.txt_a_5.setText(null);
        this.txt_Npkp.setText(null);
        this.txt_square.setText(null);
        this.txt_A_admin.setText(null);
        this.txt_S_zagal.setText(null);
        this.txt_Cn.setText(null);
        this.txt_B_admin.setText(null);
        this.txt_kilk.setText(null);
        this.txt_Kilk_Evak_Vyh.setText(null);
        this.txt_C0.setText(null);
        this.txtArea_VyhDani.setText(null);
    }

    @FXML
    void example(ActionEvent event) {
        this.txt_A.setText("162");
        this.txt_B.setText("36");
        this.txt_a_4.setText("0");
        this.txt_a_3.setText("0");
        this.txt_a_2.setText("0");
        this.txt_a_1.setText("194");
        this.txt_Zag_kilk_prac.setText("142");
        this.txt_a_5.setText("2");
        this.txt_Npkp.setText("1");
        this.txt_square.setText("5832");
        this.txt_A_admin.setText("18");
        this.txt_S_zagal.setText("1166");
        this.txt_Cn.setText("70");
        this.txt_B_admin.setText("36");
        this.txt_kilk.setText("2");
        this.txt_Kilk_Evak_Vyh.setText("2");
        this.txt_C0.setText("2100");
        calk();
    }
}
