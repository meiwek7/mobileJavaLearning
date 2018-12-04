package bakhmat.semka.mobile.LessonLayouts;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import bakhmat.semka.mobile.R;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getScrollView(this));
    }

    protected View getScrollView(Context context){

        ScrollView layout = new ScrollView(context);

        TextView lblText = new TextView(context);

        lblText.setText("Коа́ла[1] (лат. Phascolarctos cinereus) — вид сумчатых, обитающий в Австралии. Единственный современный представитель семейства коаловых (Phascolarctidae) из отряда двурезцовых сумчатых (Diprotodontia).\n" +
                "\n" +
                "\n" +
                "Содержание\n" +
                "1\tЭтимология\n" +
                "2\tАреал\n" +
                "3\tИстория изучения\n" +
                "4\tФизическая характеристика\n" +
                "5\tОбраз жизни и питание\n" +
                "6\tСоциальная структура и размножение\n" +
                "7\tЭволюция и филогенез\n" +
                "8\tСтатус популяции и охрана\n" +
                "9\tПримечания\n" +
                "10\tСсылки\n" +
                "Этимология\n" +
                "Слово коала (англ. koala) происходит от даракского[en] слова gulawan или его укороченной формы gula. Первоначально транскрибированное на латинский шрифт как cullawine, его постепенно вытеснил вариант koola. Хотя гласная /u/ была первоначально написана в английской орфографии как «оо», она, возможно по ошибке, было изменена на «oa»[2]. Ошибочно считалось, что это слово означало «не пьёт»[2].\n" +
                "\n" +
                "Видовое название cinereus было предложено в 1817 году Георгом Августом Гольдфусом, и с латинского языка означает «пепельный»[3][4].\n" +
                "\n" +
                "Несмотря на то, что таксономически коалы не являются медведями или близкими к ним животными, англоговорящие поселенцы конца XVIII века называли их медведем коала (англ. koala bear) из-за внешнего сходства коал и медведей и это название до сих пор используется за пределами Австралии[5], хотя его использование не рекомендуется из-за возникающей амбивалентности названия[6][7][8][9][10].\n" +
                "\n" +
                "Ареал\n" +
                "Естественный ареал коалы включает в себя прибрежные районы на востоке и юге Австралии, на территории от Аделаиды на севере, до южной части полуострова Кейп-Йорк. Также они распространены в регионах с достаточным количеством влаги для поддержки подходящих коалам лесов. Коалы штата Южная Австралия были в значительной степени уничтожены в течение первой половины XX века, но с помощью особей из штата Виктория, популяция коал в Южной Австралии восстановлена. В начале XX века они были завезены в Янчепe в Западной Австралии[11], а также на ряд островов у побережья Квинсленда, в том числе острове Кенгуру и Магнитный остров, который предположительно является самой северной оконечностью современного ареала коал. Общая площадь ареала коал составляет около 1 000 000 км² и включает в себя не менее 30 биогеографических регионов[12].\n" +
                "\n" +
                "История изучения\n" +
                "Коалы остались незамеченными экспедицией Джеймса Кука, в 1770 году открывшей восточное побережье Австралии. Первое упоминание о них встречается в отчёте Джона Прайса, слуги губернатора Нового Южного Уэльса Джона Хантера, о путешествии в Голубые горы в 1798 году. Прайс пишет, что в Голубых горах водится животное, называемое куллавайн, внешне похожее на ленивца[13]. Для науки коала был открыт в 1802 году флотским офицером Барралье, который обнаружил у аборигенов останки коалы и послал заспиртованные конечности зверя Филипу Кингу[en], губернатору Нового Южного Уэльса[14]. В июне 1803 года живой коала был пойман к югу от Сиднея, а 21 августа газета Sydney Gazette поместила его подробное описание[13]. В 1808 году коалы были определены как вид схожий с вомбатами.\n" +
                "\n" +
                "Примерно в течение полувека коал находили только в пределах Нового Южного Уэльса. В 1855 году натуралист Уильям Бландовски встретил его в штате Виктория, а в 1923 году О. Томас — в юго-восточной части Квинсленда[15].");

        lblText.setTextSize(70);

        ScrollView.LayoutParams lblLayoutParameters = new ScrollView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        layout.addView(lblText,lblLayoutParameters);

        return layout;
    }

}
