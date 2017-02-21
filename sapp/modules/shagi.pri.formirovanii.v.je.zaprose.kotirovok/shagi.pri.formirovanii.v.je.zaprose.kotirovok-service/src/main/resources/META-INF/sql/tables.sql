create table sapp.shagi_pri_formirovanii_v_je_zaprose_kotirovok (
	informacija_o_razmewenii BOOLEAN,
	izvewenie_id LONG,
	konkursnaja_dokumentacija BOOLEAN,
	obwaja_informacija BOOLEAN,
	porjadok_raboty_komissii BOOLEAN,
	shagi_pri_formirovanii_v_je_zaprose_kotirovok_id LONG not null primary key,
	spisok_lotov BOOLEAN
);