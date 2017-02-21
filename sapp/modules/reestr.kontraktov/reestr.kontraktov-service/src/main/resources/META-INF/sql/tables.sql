create table sapp.reestr_kontraktov (
	data_kontrakta DATE null,
	data_sozdanija DATE null,
	izvewenie_id LONG,
	lot_id LONG,
	postavwik_id LONG,
	reestr_kontraktov_id VARCHAR(75) not null primary key,
	sozdal LONG
);