package ex05_fxml.calc;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController {
	Parent root;
	TextField result;
	Double sum;
	
	public void setRoot(Parent root) {
		// TODO Auto-generated method stub
		this.root = root;
		
		// fx:id 의 값으로 control 객체 가져오기
		// fx:id 앞에는 반드시 # 를 사용해야 한다.
		result = (TextField) root.lookup("#result");
		result.setText("0");
	}

	public void pressNum(ActionEvent event) {
		Button value = (Button) event.getSource();
		
		if(result.getText().equals("0") && !(value.getText().equals("."))) {
			result.setText("");
		}
		result.setText(result.getText() + value.getText());
	}
	
	public void pressOper(ActionEvent event) {
		Button oper = (Button) event.getSource();
		
		if(oper.getText().equals("AC")) {
			result.setText("0");
		} else if(oper.getText().equals("<")) {
			String value = 
					result.getText().substring
						(0, result.getText().length()-1);
			if(value.length() > 0 ) {
				result.setText(value);
			} else {
				result.setText("0");
			}
		} else if(oper.getText().equals("=")) {
			String res[] = result.getText().split
					("\\+|\\-|\\*|\\/|\\=");
			String op[] = result.getText().split(
					"0|1|2|3|4|5|6|7|8|9|0|\\.");
			
			for(String r : res) {
				System.out.println("r : " + r);
			}
			for(String o : op) {
				System.out.println("o : " + o);
			}
			int cnt = 1;
			for(String s : op) {
				if(s != null && s.length() > 0) {
					op[cnt] = s;
					cnt++;
				}
			}
			
			int start =0;
			int end = 0;
			
			for(int i=0;i<res.length;i++) {
				if(res[i].contains("(")) {
					String s[] = res[i].split("\\(");
					res[i] = s[1];
					
					String o[] = op[i].split("\\(");
					op[i] = o[0];
					start = i;
				}
				
				if(res[i].contains(")")) {
					String s[] = res[i].split("\\)");
					res[i] = s[0];
					
					String o[] = op[i].split("\\)");
					op[i] = o[0];
					
					end = i;
				}
				
				if(op[i].contains(")")) {
					String o[] = op[i].split("\\)");
					op[i] = o[1];
					System.out.println("(  : "  +  o[1]);
				}
			}
			
			for(int i=0;i<=end-start;i++) {
				String tmp = res[i];
				res[i] = res[start + i];
				res[start + i] = tmp;
				
				if(i != 0) {
					String otmp = op[i];
					op[i] = op[start+i];
					op[start + i] = otmp;
				}
			}
			
			for(String r : res) {
				System.out.println(r);
			}
			
			for(String o : op) {
				System.out.println(o);
			}
			
			for(int i=0;i<res.length;i++) {
				if(i == 0) {
					sum = Double.parseDouble(res[i]);
				} else {
					String o = op[i];
					switch(o) {
					case "+":
						sum += Double.parseDouble(res[i]);
						break;
					case "-":
						sum -= Double.parseDouble(res[i]);
						break;
					case "*":
						sum *= Double.parseDouble(res[i]);
						break;
					case "/":
						sum /= Double.parseDouble(res[i]);
						break;			
					}
				}
			}
			
			if(sum.toString().contains(".0")){
				result.setText(sum.toString().substring(0, 
						sum.toString().length() - 2));
			} else {
				result.setText(sum.toString());
			}
			
		} else {
			result.setText(result.getText() + oper.getText());
		}	
	}
}