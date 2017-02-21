create table sapp.rezultat_rassmotrenija_pretenzii (
	data_zagruzki DATE null,
	imja_fajla VARCHAR(75) null,
	izvewenie_id LONG,
	lot_id LONG,
	nazvanie_dokumenta VARCHAR(75) null,
	postavwik_id LONG,
	rezultat_rassmotrenija_pretenzii_id LONG not null primary key,
	zagruzil LONG
);