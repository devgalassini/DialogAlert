package galassini.tecnology.dialog

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnDialog).setOnClickListener {
            showDialogNormal()
        }
    }

    private fun showDialogNormal() {
        val build = AlertDialog.Builder(this, R.style.ThemeCustomDialog)
        val view = layoutInflater.inflate(R.layout.custom_dialog, null)

        build.setView(view)

        val btnClose = view.findViewById<ImageButton>(R.id.btnClose)
        btnClose.setOnClickListener { dialog.dismiss() }

        dialog = build.create()
        dialog.show()
    }
}
