package com.app.me.androidsimplequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variables
    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private int mCurrentIndex = 0;

    private Question[] mQuestionBank = new Question[]
            {
                    new Question(R.string.question_africa, false),
                    new Question(R.string.question_americas, true),
                    new Question(R.string.question_android_founded, false),
                    new Question(R.string.question_android_froyo, false),
                    new Question(R.string.question_android_users, false),
                    new Question(R.string.question_asia, true),
                    //new Question("Cleveland is the state capital of Ohio", false),

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the reference to the variable
        mTrueButton = (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);

        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);

        int question = mQuestionBank[mCurrentIndex].getmTextResID();

        mQuestionTextView.setText(question);

        mTrueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "YES, YOU ARE CORRECT!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "NO, YOU ARE INCORRECT!!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //added
        mNextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
                int question = mQuestionBank[mCurrentIndex].getmTextResID();
                mQuestionTextView.setText(question);
            }
        });



    }
}
