create table sapp.konkursnaja_dokumentacija (
	data_zagruzki DATE null,
	imja_fajla VARCHAR(75) null,
	izvewenie_id LONG,
	konkursnaja_dokumentacija_id LONG not null primary key,
	lot_id LONG,
	nazvanie_dokumenta VARCHAR(75) null,
	zagruzil LONG
);