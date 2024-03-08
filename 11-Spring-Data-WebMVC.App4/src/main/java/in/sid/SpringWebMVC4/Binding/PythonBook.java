package in.sid.SpringWebMVC4.Binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PythonBook {
	
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
