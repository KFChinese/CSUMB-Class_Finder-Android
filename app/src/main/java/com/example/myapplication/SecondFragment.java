/*
Name: Larry Chiem
Class: CST 338-40
Date: Dec. 15, 2020
Assignment Name: (M7) Write a Java program (Simple Android App) (4 hrs)
Language: Java 
Editor: Android Studio
Env: Windows 10 x64 (Ver. 20H2)

*/


package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

/*
 * SecondFragment Class is the second page that lets the viewer see the 
 * classes requested by the viewer.
 * @author Larry Chiem
*/

public class SecondFragment extends Fragment {

    EditText class_ID;
    Button submit_btn;
    TextView class_ID_Results;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
	
	// Points to id's Created for classes.
	
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        class_ID = getView().findViewById(R.id.class_ID);
        submit_btn = getView().findViewById(R.id.submit_btn);
        class_ID_Results = getView().findViewById(R.id.class_ID_Results);
        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
				
		
		// Listens to User's Tap, which will turn them to the front page.
		
		public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
		
		// Sets the class_ID_Results visability not visable to the user.
        
		class_ID_Results.setVisibility(View.GONE);
        view.findViewById(R.id.submit_btn).setOnClickListener(new View.OnClickListener(){
            @Override
			
			// Listens to user's Input and tap to output result.
            public void onClick(View view){
                String idNumber  = class_ID.getText().toString().trim();
                String idClass;

                    int numCheck = Integer.parseInt(idNumber);
					
					//Uses a switch statment to check for valid input from user.
                    switch (numCheck) {
                        case 237:
                            idClass = getString(R.string.cst237_course) + "\n\n" + getString(R.string.cst237_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 170:
                            idClass = getString(R.string.cst170_course) + "\n\n" + getString(R.string.cst170_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 150:
                            idClass = getString(R.string.cst150_course) + "\n\n" + getString(R.string.cst150_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 151:
                            idClass = getString(R.string.cst151_course) + "\n\n" + getString(R.string.cst151_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 270:
                            idClass = getString(R.string.cst270_course) + "\n\n" + getString(R.string.cst270_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 300:
                            idClass = getString(R.string.cst300_course) + "\n\n" + getString(R.string.cst300_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 338:
                            idClass = getString(R.string.cst338_course) + "\n\n" + getString(R.string.cst338_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 311:
                            idClass = getString(R.string.cst311_course) + "\n\n" + getString(R.string.cst311_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 334:
                            idClass = getString(R.string.cst334_course) + "\n\n" + getString(R.string.cst334_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 336:
                            idClass = getString(R.string.cst336_course) + "\n\n" + getString(R.string.cst336_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 363:
                            idClass = getString(R.string.cst363_course) + "\n\n" + getString(R.string.cst363_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 370:
                            idClass = getString(R.string.cst370_course) + "\n\n" + getString(R.string.cst370_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 438:
                            idClass = getString(R.string.cst438_course) + "\n\n" + getString(R.string.cst438_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 462:
                            idClass = getString(R.string.cst462_course) + "\n\n" + getString(R.string.cst462_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 499:
                            idClass = getString(R.string.cst499_course) + "\n\n" + getString(R.string.cst499_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 383:
                            idClass = getString(R.string.cst383_course) + "\n\n" + getString(R.string.cst383_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        case 325:
                            idClass = getString(R.string.cst325_course) + "\n\n" + getString(R.string.cst325_desc);
                            class_ID_Results.setText(idClass);
                            break;

                        default:
                            idClass = getString(R.string.invalid_Txt);
                            class_ID_Results.setText(idClass);
                            break;
                    }
					
				// Sets the class and description to viewable for the user to see.
                class_ID_Results.setVisibility(View.VISIBLE);
            }
        });

    }
}