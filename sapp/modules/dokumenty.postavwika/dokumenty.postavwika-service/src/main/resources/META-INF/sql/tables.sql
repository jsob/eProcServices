create table sapp.dokumenty_postavwika (
	data_zagruzki DATE null,
	dokumenty_postavwika_id LONG not null primary key,
	imja_fajla VARCHAR(75) null,
	nazvanie_dokumenta VARCHAR(75) null,
	postavwik_id LONG,
	tip_dokumenta INTEGER,
	zagruzil LONG
);