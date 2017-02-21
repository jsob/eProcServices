create table sapp.podtverzhdenie_nalichija_sredstv (
	data_zagruzki DATE null,
	imja_fajla VARCHAR(75) null,
	izvewenie_id LONG,
	lot_id LONG,
	nazvanie_dokumenta VARCHAR(75) null,
	podtverzhdenie_nalichija_sredstv_id LONG not null primary key,
	zagruzil LONG
);