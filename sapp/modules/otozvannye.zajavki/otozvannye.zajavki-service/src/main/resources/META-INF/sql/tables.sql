create table sapp.otozvannye_zajavki (
	data_otzyva DATE null,
	itogo_za_tovar DOUBLE,
	izvewenie_id LONG,
	kolichestvo INTEGER,
	lot_id LONG,
	otozval LONG,
	otozvannye_zajavki_id LONG not null primary key,
	postavwik_id LONG,
	summa_za_edinicu_tovara DOUBLE,
	tovar_id LONG
);