create table sapp.podtverzhdenie_na_uchastie (
	data_sozdanija DATE null,
	izvewenie_id LONG,
	lot_id LONG,
	podtverzhdenie_na_uchastie_id LONG not null primary key,
	postavwik_id LONG,
	sozdal LONG
);