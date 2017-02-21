create table sapp.dokumenty_na_zajavku (
	dokumenty_na_zajavku_id LONG not null primary key,
	data_zagruzki DATE null,
	imja_fajla VARCHAR(75) null,
	izvewenie_id LONG,
	lot_id LONG,
	nazvanie_dokumenta VARCHAR(75) null,
	postavwik_id LONG,
	zagruzil LONG
);