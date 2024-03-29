package com.jcnetwork.android.jctestapp1.hiddenactivities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jcnetwork.android.jctestapp1.R;
import com.jcnetwork.android.jctestapp1.adapters.FAQExpandableCardViewAdapter;
import com.jcnetwork.android.jctestapp1.models.QandA;

import java.util.ArrayList;
import java.util.List;

public class FAQsActivity extends AppCompatActivity {

    /** Variables **/
    private ImageButton mSupportBtn; // button to write email to jcnetwork support
    private RecyclerView mList;
    private List<QandA> qandAList = new ArrayList<>();
    private androidx.appcompat.widget.SearchView mSearchBar;
    private FAQExpandableCardViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hidden_activity_faq);

        // Set up support bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.color_gradient));
        }

        // Find views
        mSupportBtn = (ImageButton) findViewById(R.id.support_button);
        mList = (RecyclerView) findViewById(R.id.list);
        //mList.setHasFixedSize(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(manager);
        mSearchBar = (androidx.appcompat.widget.SearchView) findViewById(R.id.search_bar);


        // General
        //        QandA qandA = new QandA("Question 1", "Answer 1"); TEMPLATE
        //        qandAList.add(qandA);
        QandA qand1 = new QandA("Was ist das JCNetwork Certified Junior Consultant Program?", "Das JCNetwork Certified Junior Consultant Program zeichnet herausragende Junior Consultants aus, die ein breites theoretisches Wissen sowie die praktische Anwendung theoretischer Kenntnisse vorweisen können. Die persönliche Exzellenz der Junior Consultants spiegelt direkt die Qualität der Beratungsleistungen wider, die durch die regionalen studentischen Unternehmensberatungen angeboten werden. Durch umfangreiche Maßnahmen zur Qualitätssicherung und der Unterstützung durch unseren Zertifizierungspartner UMS Consulting GmbH & Co. KG können wir garantieren, dass zertifizierte Junior Consultants über vielfältige beratungsrelevante Kompetenzen verfügen. Die Inhalte des Zertifikates resultieren aus den Anforderungen mit denen studentische Berater im Rahmen ihrer Tätigkeiten konfrontiert werden.");
        qandAList.add(qand1);
        QandA qand2 = new QandA("Wer ist unser Zertifizierungspartner?", "Die UMS Consulting GmbH & Co. KG ist die führende Strategieumsetzungsberatung und unterstützt Unternehmen weltweit dabei, vorhandene Potenziale aufzuzeigen und zu realisieren.");
        qandAList.add(qand2);
        QandA qand3 = new QandA("Wie wird man JCNetwork Certified Junior Consultant?", "Alle Mitglieder einer dem JCNetwork angeschlossenen studentischen Unternehmensberatung können nach Erreichen vorgeschriebener Qualifikationen als Junior Consultant zertifiziert werden. Hierzu muss sowohl theoretisches Wissen erlangt werden, relevante Praxiserfahrung gesammelt werden und im Rahmen einer Abschlussprüfung ein reales Fallbeispiel aus dem Beratungsalltag absolvieren.");
        qandAList.add(qand3);
        QandA qand4 = new QandA("Welche Programmpunkte sind verpflichtend für den Teilnehmer?", "Das ist von Veranstaltung zu Veranstaltung unterschiedlich. Generell jedoch alle Workshops, bei denen du dich angemeldet hast. Plenen, außerhalb der Vorstandsrunde, sind Pflicht für mind. einen Vorstand aus jedem Verein. Außerdem sind die Firmenkontaktmesse und die MV verpflichtend.");
        qandAList.add(qand4);
        // Workshops
        QandA qand5 = new QandA("Wie bewerbe ich mich auf externe Workshops?", "Mit einem ausgefüllten Lebenslauf kannst du dich bei Anmeldestart auf externe Workshops bewerben. Pro Tipp: auf gleich mehrere bewerben, um größere Chancen zu haben, einen der begehrten Plätze zu ergattern.");
        qandAList.add(qand5);
        QandA qand6 = new QandA("Ich habe mich für mehrere externe Workshops in einem Slot beworben. Falls ich von mehreren Unternehmen zugelassen werde, kann ich mir den Workshop dann aussuchen?", "Nein, der Workshop wird vom JCNetwork zugeteilt.");
        qandAList.add(qand6);
        QandA qand7 = new QandA("Ich kann mich nicht auf externe Workshops bewerben. Woran kann das liegen?", "Entweder ist der Lebenslauf noch nicht ausgefüllt oder die Bewerbungsphase ist bereits abgelaufen.");
        qandAList.add(qand7);
        QandA qand8 = new QandA("Wie erhalte ich Credit-Points für meine Teilnahme an Schulungen?", "Unbedingt die Umfrage ausfüllen am Ende der Schulung. Um den Rest kümmert sich der JCNetwork Vorstand. Konkrete Fragen können direkt an den Vorstand für Weiterbildung gestellt werden.");
        qandAList.add(qand8);
        QandA qand9 = new QandA("Ich bin Referent und habe eine Frage bzgl. meines Workshops.", "Fragen direkt an Vorstand Weiterbildung.");
        qandAList.add(qand9);
        // Anmelden und Abmelden
        QandA qand19 = new QandA("Ich war noch nie bei einer Veranstaltung. Wie kann ich mich anmelden?", "Falls du noch nicht registriert bist, registriere dich bitte zuerst unter https://intern.jcnetwork.de/register. Danach kannst du dich auf der Eventseite anmelden mit dem erstellten Konto.");
        qandAList.add(qand19);
        QandA qand10 = new QandA("Welche Unterschiede gibt es in den Anmeldeoptionen?", "Das unterscheidet sich von Veranstaltung zu Veranstaltung. Generell ist es abhängig von deiner Rolle in der Veranstaltung, z.B. normaler Junior Consultant oder Mithelfer bei der Ausrichtung des Events.");
        qandAList.add(qand10);
        QandA qand11 = new QandA("Alle Anmeldeoptionen sind ausgebucht. Wird die Anzahl an Plätzen nochmal aufgestockt?", "Falls die Anmeldeoptionen ausgebucht sind, wird alles dafür getan, weitere Kapazitäten zu organisieren und für die Anmeldung freizuschalten. Falls es zu einer Aufstockung der Plätze kommt, werden die Vereine über Social Media und E-Mail darauf hingewiesen. Die Vergabe der Plätze erfolgt nach dem First-Come-First-Serve Prinzip. Daher hopp-hopp in der Anmeldung!");
        qandAList.add(qand11);
        QandA qand12 = new QandA("Ich bin Referent für einen Workshop. Muss ich mich über die Eventseite anmelden?", "Ja.");
        qandAList.add(qand12);
        QandA qand13 = new QandA("Ich muss mich von den JCNetwork Days abmelden. Bei wem muss ich mich melden?", "Beim Vorstand Event Management.");
        qandAList.add(qand13);
        // Unterkunft
        QandA qand14 = new QandA("Kann ich meine Unterkunft bzw. Zimmer wechseln?", "Nein. Nach Abschluss der Zuteilung werden keine Änderungen seitens des JCNetwork vorgenommen.");
        qandAList.add(qand14);
        QandA qand15 = new QandA("Ich möchte mit einer bestimmten Person auf ein Zimmer. An wen wende ich mich?", "Bitte schreibe deine Wunschperson in das Feld „Sonstiges“ im Anmeldeformular. Wir versuchen deinen Wunsch zu berücksichtigen, können jedoch nichts versprechen.");
        qandAList.add(qand15);
        // Finanzen und Bezahlung
        QandA qand16 = new QandA("Ich benötige eine Rechnung bzw. Zahlungsbestätigung seitens des JCNetwork. Wie bekomme ich diese?", "Mit einer kurzen Anfrage beim Vorstand Finanzen und Recht.");
        qandAList.add(qand16);
        QandA qand17 = new QandA("Ich bin Referent, muss ich zahlen?", "Bei physischen Veranstaltungen immer, bei digitalen nur, wenn auch an anderen Veranstaltungspunkten teilgenommen wird.");
        qandAList.add(qand17);
        QandA qand18 = new QandA("Bekomme ich meine Teilnahmegebühr erstattet, wenn ich mich aus privaten Gründen abmelden muss?", "Normalerweise nicht. Besondere Umstände können mit Finanzen und Recht besprochen werden.");
        qandAList.add(qand18);
        QandA fr_4 = new QandA("Ich habe die Mitteilung bekommen, dass ich eine Mahngebühr zahlen muss, da ich zu spät überwiesen habe. Ich habe jedoch meinen Beitrag innerhalb der Frist beglichen. Warum bzw. was mache ich jetzt?", "Relevant für die Feststellung des Zahlungseingangs ist das Valutadatum auf dem Konto des JCNetwork. Eine verspätete Zahlung liegt demnach auch dann vor, wenn der Teilnahmebeitrag fristgerecht in Auftrag gegeben wurde, jedoch erst nach dem Stichtag auf dem Konto des JCNetwork verbucht wurde. In solchen Fällen wird gibt es jedoch eine Kulanzregelung. Weis mittels Screenshots oder Buchungsbestätigung der Bank nach, dass der Betrag fristgemäß in Auftrag gegeben wurde. Andernfalls bist du verpflichtet, einen Verspätungszuschlag zu entrichten. Der Überweisungszweck (ID.Vorname.Nachname) ist dabei einzuhalten und um den Baustein \"Verspätungszuschlag\" zu ergänzen (ID.Vorname.Nachname.Verspaetungszuschlag). Die ID findest du in der Anmeldebestätigung. Sofern keine Zahlung des Verspätungszuschlages vor Beginn der Veranstaltung erfolgt, kann dir die Teilnahme verwehrt werden.");
        qandAList.add(fr_4);


        // Set up adapter
        adapter = new FAQExpandableCardViewAdapter(qandAList);

        // Set to list
        mList.setAdapter(adapter);

        // Set on click listener to image button to contact support
        String[] recipients = {"support@jcnetwork.de"};

        mSupportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO); // Only email apps should handle this intent (otherwise SEND ok)
                emailIntent.setData(Uri.parse("mailto:")); // Only email apps no social media stuff
                emailIntent.putExtra(Intent.EXTRA_EMAIL, recipients); // string array
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Generelle Frage"); // subject -> easy search later
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Was ist deine Frage?"); // text
                if (emailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(emailIntent);
                }
            }
        });

        mSearchBar.setOnQueryTextListener(new androidx.appcompat.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.filter(newText);
                // Refresh with old data if empty text
                if (newText.isEmpty()) {
                    // Set up adapter
                    adapter = new FAQExpandableCardViewAdapter(qandAList);

                    // Set to list
                    mList.setAdapter(adapter);
                }
                return false;
            }
        });
        mSearchBar.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                // Restore original data
                // Set up adapter
                adapter = new FAQExpandableCardViewAdapter(qandAList);

                // Set to list
                mList.setAdapter(adapter);
                return false;
            }
        });

    }

}
