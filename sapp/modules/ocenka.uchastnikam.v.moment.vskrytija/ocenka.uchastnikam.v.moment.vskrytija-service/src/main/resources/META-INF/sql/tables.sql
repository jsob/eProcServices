create table sapp.ocenka_uchastnikam_v_moment_vskrytija (
	data_otkaza DATE null,
	data_vskrytija DATE null,
	izvewenie_id LONG,
	lot_id LONG,
	ocenka_uchastnikam_v_moment_vskrytija_id LONG not null primary key,
	otkazal LONG,
	postavwik_id LONG,
	prichina_otkaza VARCHAR(75) null,
	protokol_vskrytija_id LONG,
	status LONG
);