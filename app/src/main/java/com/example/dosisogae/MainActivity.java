package com.example.dosisogae;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.dosisogae.ui.main.SectionsPagerAdapter;
import com.example.dosisogae.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        myRecyclerViewAdapter adapter;
        RecyclerView recyclerView;

        ArrayList<DataModel> dataModels = new ArrayList();

        dataModels.add(new DataModel("서울특별시",R.drawable.city1_1,"서울특별시는 대한민국의 수도이자 최대 도시이다. 백제의 첫 수도인 위례성이었고, 고려의 남경이었으며, 조선의 수도가 된 이후로 현재까지 대한민국 정치·경제·사회·문화의 중심지이다. 중앙으로 한강이 흐르고, 북한산, 관악산, 도봉산, 불암산, 인릉산, 청계산, 아차산 등의 산들로 둘러싸인 분지 지형의 도시이다. 서울의 면적은 605.2 km2로 대한민국 면적의 0.6%이고, 인구는 약 970만 명으로 대한민국 인구의 18.7%를 차지한다. 시청 소재지는 중구이며, 25개의 자치구가 있다. 1986년 아시안 게임, 1988년 하계 올림픽, 2010년 서울 G20 정상회의 등을 개최하였다. 2018년 서울의 지역내총생산은 422조원이었다."));
        dataModels.add(new DataModel("부산광역시",R.drawable.city1_2,"부산광역시(釜山廣域市, 영어: Busan Metropolitan City)는 대한민국 동남부 해안에 위치한 광역시이다. 대한민국의 도시이자 최대의 해양 물류 도시이며, 부산항을 중심으로 해상 무역과 물류 산업이 발달하였다. 일본과는 대한해협과 쓰시마섬을 사이에 두고 마주하고 있다. 시청 소재지는 연제구 연산동이며, 행정구역으로는 15구 1군을 두고 있다. 한반도 동남부에 위치하며 대한해협을 사이로 일본과 마주하고 있다. 시청을 기준으로 일본과의 직선거리는 쓰시마 섬까지는 49.5km, 일본 본토의 후쿠오카까지는 약 180km이며, 이는 서울까지의 직선거리인 325km와 비교했을 때 상당히 가까운 거리이다. 서쪽으로 낙동강 하류의 선상지인 김해평야, 북쪽으로 금정산, 동쪽으로는 동해, 남쪽으로는 남해가 위치한다. 행정구역상으로는 서쪽으로 경상남도 김해시·창원시 진해구, 북쪽으로는 양산시, 동북쪽으로는 울산광역시와 경계를 접하고 있다. 총 면적은 769.82km2이다."));
        dataModels.add(new DataModel("인천광역시",R.drawable.city1_3,"인천광역시(仁川廣域市, 영어: Incheon Metropolitan City)는 대한민국 북서부에 있는 광역시이다. 육지를 기준으로 북쪽으로 경기도 김포시, 동쪽으로 서울특별시 강서구, 경기도 부천시와 접해있으며, 남동쪽으로 경기도 시흥시, 서쪽으로 황해와 접한다. 서쪽으로 황해를 사이로 중화인민공화국과 마주하고 있다. 인천항과 인천국제공항을 중심으로 제조업과 물류 산업이 발달하였으며 2003년 인천광역시경제자유구역청이 개청되어 송도 · 청라 · 영종 지구를 관할한다. 시청 소재지는 남동구 구월동이고, 행정구역은 8구 2군으로 구성되어 있다."));
        dataModels.add(new DataModel("대구광역시",R.drawable.city1_4,"대구광역시(大邱廣域市)는 한반도 동남부 내륙에 있는 광역시이며, 대한민국 제 3도시이다. 동쪽으로 경상북도 경산시, 영천시, 서쪽으로 고령군, 성주군, 북쪽으로 군위군, 청송군, 남쪽으로 경상남도 창녕군과 인접한다. 팔공산과 비슬산 등 높은 산으로 둘러싸인 분지 지형으로 인해 대한민국에서 가장 기온이 높은 편에 속하는 도시이며, 대구 특수형 기후 지역으로 분류된다. 조선시대에는 경상 감영 소재지로서 영남 지방의 중심지였다. 섬유 산업을 중심으로 도시가 성장하면서 1981년 7월 1일 대구시가 달성군 월배읍·성서읍·공산면, 칠곡군 칠곡읍, 경산군 안심읍·고산면을 편입하여 직할시로 승격되었고, 1995년 3월 1일 달성군을 편입하였다. 동성로와 중앙로를 중심으로 도심을 형성하고 있다. 시청 소재지는 중구 동인동 1가이고, 행정구역은 7구 1군이다."));
        dataModels.add(new DataModel("광주광역시",R.drawable.city1_5,"광주광역시(光州廣域市)는 대한민국의 남서부에 있는 광역시이다. 남동쪽으로 전라남도 화순군, 북동쪽으로 담양군, 서쪽으로 함평군, 서남쪽으로 나주시, 북쪽으로 장성군과 접한다. 시청 소재지는 서구 치평동이고, 행정 구역은 5구 95동이다. 광주 학생 항일 운동과 5·18 광주 민주화 운동이 발생한 지역이다. 전남대학교, 조선대학교, 광주과학기술원 등 고등 교육기관이 있다. 2년마다 광주 비엔날레가 열리고, 아시아문화중심도시 조성 사업이 국책으로 진행됐다."));
        dataModels.add(new DataModel("대전광역시",R.drawable.city1_6,"대전광역시(大田廣域市)는 대한민국의 중앙부에 있는 광역시이다. 경부고속철도, 경부선, 호남선 철도가 분기하고, 경부고속도로와 호남고속도로지선, 당진영덕고속도로 등 주요 고속도로가 연결되는 교통의 중심이다. 1997년 정부대전청사가 설립되어 중앙행정기관이 입주해 있으며, 한국철도공사, 한국조폐공사, 한국수자원공사 등 공기업 본사도 소재한다. 대덕연구개발특구가 조성되어 한국과학기술원(KAIST), 한국원자력연구원(KAERI), 한국전자통신연구원(ETRI), 한국항공우주연구원, 한국화학연구원, 한국과학기술정보연구원 등 정부출연연구기관과 전력연구원 등 공공 및 민간 연구소가 밀집한 과학·연구도시이다. 1993년 세계 박람회를 성공적으로 개최하여 과학도시로서 위상을 확립하였고, 2011년 국제과학비즈니스벨트 거점도시로 지정되었다. 시청은 서구 둔산동에 있고, 행정구역은 5구 177법정동 78행정동이다."));
        dataModels.add(new DataModel("울산광역시",R.drawable.city1_7,"울산광역시(蔚山廣域市)는 대한민국 남동부 해안에 있는 광역시이다. 서쪽으로 경상남도 밀양시·양산시, 경상북도 청도군, 북쪽으로 경상북도 경주시, 남쪽으로 부산광역시 기장군과 접한다. 태화강이 도시를 가로질러 동해로 흐르며, 동해안에 울산항과 방어진항, 온산항이 위치한다. 현대중공업, 현대미포조선 등의 대기업 본사들과 현대자동차, 현대모비스, 한화솔루션, SK이노베이션, S-OIL, LG화학, 롯데케미칼 등의 대기업들이 있고, 한국석유공사, 에너지관리공단, 에너지경제연구원, 한국동서발전, 한국산업인력공단, 근로복지공단, 안전보건공단 등 공기업이 있으며, 자동차·조선 및 석유화학 공업이 발달해 있다. 2014년 기준 1인당 GRDP 6,110만원으로 전국에서 가장 높다. 울산은 대한민국 총 수출의 17.7%를 차지한다. 산업 발달의 영향으로 인구가 급증하여 1997년 7월 15일 광역시로 승격되었다. 특별·광역시 중 관할 면적이 가장 넓지만 인구는 가장 적다."));
        dataModels.add(new DataModel("세종특별자치시",R.drawable.city1_8,"세종특별자치시(世宗特別自治市)는 대한민국의 행정 수도 기능을 하는 특별자치시이다. 시의 중심으로 금강과 미호천이 흐른다. 남쪽으로 대전광역시, 서쪽으로 충청남도 공주시, 동쪽으로 충청북도 청주시, 북쪽으로 충청남도 천안시와 접한다. 옛 충청남도 연기군 전체와 공주시의 일부(現 장군면), 충청북도 청원군의 일부(現 부강면)를 편입하여 2012년 7월 1일에 출범하였다. 산하에 기초지방자치단체를 두지 않는 단층제 광역지방자치단체로, 행정구역은 1읍 9면 10 행정동 18 법정동이다. 국토 균형발전의 가치를 실현하고 서울의 과밀화를 해결하기 위해서 혁신도시 사업과 연계하여 한솔동, 도담동 일대에 행정중심복합도시가 조성되었고, 정부서울청사와 정부과천청사에 분산되어 있던 9부 2처 2청의 정부기관이 정부세종청사로 이전되었다. 시의 이름은 국민 공모를 통해 선정되었으며, 조선 세종의 묘호를 따서 세상(世)의 으뜸(宗)이라는 의미를 담고 있다. 어진동에는 정부세종청사가 있고, 시청 소재지는 보람동이다."));
        dataModels.add(new DataModel("제주특별자치도",R.drawable.city1_9,"제주특별자치도(濟州特別自治道)는 대한민국의 제주도(濟州島)와 부속 섬들을 관할하는 특별자치도이다. 대한민국에서 가장 큰 섬인 제주도(濟州島) 본섬을 비롯하여 마라도, 우도, 추자군도 등을 포함한 유인도 8개, 무인도 55개로 구성되어 있다. 한라산 일대의 아름다운 자연 경관으로 관광업 등 서비스업과 어업이 발달하였고, 제주 화산섬과 용암 동굴은 유네스코 세계 자연 유산에 등재되었다. 조선시대 전라도에 속했으나, 미군정 통치 하에 전라남도에서 분리되었고, 1946년 전라남도에서 분리되어 제주도(濟州道)가 되었다. 2006년부터는 특별자치도로 승격되어 자치경찰의 실시, 교육자치권의 확대, 일부 중앙권한의 이양, 자치입법권, 자치재정권의 부여 등 지역적 자치권이 고도화되었다. 하위에 기초지방자치단체를 두지 않은 단층제 광역지방자치단체이며, 남북으로 두 개의 행정시인 제주시와 서귀포시가 설치되어 있다."));

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new myRecyclerViewAdapter(this,dataModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
    }
}