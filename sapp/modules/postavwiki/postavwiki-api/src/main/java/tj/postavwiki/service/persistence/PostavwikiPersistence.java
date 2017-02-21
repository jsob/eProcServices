/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.postavwiki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.postavwiki.exception.NoSuchpostavwikiException;

import tj.postavwiki.model.postavwiki;

/**
 * The persistence interface for the postavwiki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.postavwiki.service.persistence.impl.postavwikiPersistenceImpl
 * @see postavwikiUtil
 * @generated
 */
@ProviderType
public interface postavwikiPersistence extends BasePersistence<postavwiki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link postavwikiUtil} to access the postavwiki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the postavwiki in the entity cache if it is enabled.
	*
	* @param postavwiki the postavwiki
	*/
	public void cacheResult(postavwiki postavwiki);

	/**
	* Caches the postavwikis in the entity cache if it is enabled.
	*
	* @param postavwikis the postavwikis
	*/
	public void cacheResult(java.util.List<postavwiki> postavwikis);

	/**
	* Creates a new postavwiki with the primary key. Does not add the postavwiki to the database.
	*
	* @param postavwiki_id the primary key for the new postavwiki
	* @return the new postavwiki
	*/
	public postavwiki create(long postavwiki_id);

	/**
	* Removes the postavwiki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki that was removed
	* @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	*/
	public postavwiki remove(long postavwiki_id)
		throws NoSuchpostavwikiException;

	public postavwiki updateImpl(postavwiki postavwiki);

	/**
	* Returns the postavwiki with the primary key or throws a {@link NoSuchpostavwikiException} if it could not be found.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki
	* @throws NoSuchpostavwikiException if a postavwiki with the primary key could not be found
	*/
	public postavwiki findByPrimaryKey(long postavwiki_id)
		throws NoSuchpostavwikiException;

	/**
	* Returns the postavwiki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param postavwiki_id the primary key of the postavwiki
	* @return the postavwiki, or <code>null</code> if a postavwiki with the primary key could not be found
	*/
	public postavwiki fetchByPrimaryKey(long postavwiki_id);

	@Override
	public java.util.Map<java.io.Serializable, postavwiki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the postavwikis.
	*
	* @return the postavwikis
	*/
	public java.util.List<postavwiki> findAll();

	/**
	* Returns a range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @return the range of postavwikis
	*/
	public java.util.List<postavwiki> findAll(int start, int end);

	/**
	* Returns an ordered range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of postavwikis
	*/
	public java.util.List<postavwiki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<postavwiki> orderByComparator);

	/**
	* Returns an ordered range of all the postavwikis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postavwikiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of postavwikis
	* @param end the upper bound of the range of postavwikis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of postavwikis
	*/
	public java.util.List<postavwiki> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<postavwiki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the postavwikis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of postavwikis.
	*
	* @return the number of postavwikis
	*/
	public int countAll();
}