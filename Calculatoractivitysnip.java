public class MainActivity extends AppCompatActivity implements OnClickListener  {
    Button  b1,b2;
	TextView output;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		  TextView output = (TextView) findViewById(R.id.output);
        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
		  
    one.setOnClickListener(youractivity.this);
    // set the onclicklistener for other buttons also
    }


    @Override
	public void onClick(View v) {
      int id = v.getId();
    switch(id) {
    case R.id.oneButton:      
       append("1",output);
       break;
    case R.id.twoButton:
        append("2",output);
       break;
    case R.id.threeButton:
        append("3",output);
       break;
     } 
      }

 private void append(String s,TextView t){
  t.setText(s); 
}
